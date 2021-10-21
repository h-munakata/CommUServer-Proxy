# -*- coding: utf-8 -*-
import socket 
import json
import sys
import time


class CommUProxy:
    def __init__(self, path_json_behavior, ip_client, port_client, ip_CommU, port_CommU, send_return=True):
        self.send_return = send_return
        print("Waiting for connecting with the client...")
        self.connect_client(ip_client, port_client)
        self.init_CommU(ip_CommU, port_CommU, path_json_behavior)


    def init_CommU(self, ip_CommU, port_CommU, path_json_behavior):
        self.motion = ControlCommU_Motion(ip_CommU, port_CommU, path_json_behavior)
    

    def connect_client(self, ip_client, port_client):
        self.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.sock.bind((ip_client, port_client))
        self.sock.listen(1)
        self.sock.settimeout(100)
        try:
            self.client, self.address_client = self.sock.accept()
            print('Succeeded to connect with the client. IP:{}, port:{}'.format(self.address_client[0], self.address_client[1]))
        except:
            print('Failed to connect with the client.')
            self.disconnect()


    def process_message(self):
        while(1):
            try:
                print('Waiting a message from the client')
                message_type, value = self.receive_message_from_client()

                if message_type=='playmotion':
                    self.motion.send_request(value)
                self.send_result_to_client('{"result":"succeeded"}')

            except:
                self.send_result_to_client('{"result":"failed"}')
                        

    def receive_message_from_client(self,buffer_size=1024):
        try:
            json_message = self.client.recv(buffer_size).decode()
            message = json.loads(json_message)
            print('Received a message from client: {}'.format(message))
            (message_type, value)  = list(message.items())[0]

            return message_type, value

        except:
            print("Received a wrong message")


    def send_result_to_client(self,message):
        if self.send_return:
            self.client.send(message.encode("utf-8"))

    
class ControlCommU_Motion:
    def __init__(self, ip_CommU, port_CommU, path_json_behavior):
        json_behavior = open(path_json_behavior,'r')
        behavior = json.load(json_behavior)
        self.playmotion = behavior["playmotion"]
        self.ip_CommU = ip_CommU
        self.port_CommU = port_CommU


    def send_request(self, key_motion):
        if key_motion in self.playmotion.keys():
            try:
                client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
                client_socket.connect((self.ip_CommU, self.port_CommU))
                path_class = self.playmotion[key_motion]
                print('Sending a request fo doing "{}" to CommU'.format(key_motion))
                client_socket.send(path_class.encode("utf-8") + "\n".encode("utf-8"))
                returned_message = client_socket.recv(1024)
                print('A message sent back from CommU: {}'.format(returned_message))
                client_socket.close()

            except KeyboardInterrupt:
                client_socket.close()
        else:
            print("This message is not expected")
            raise ValueError


if __name__ == "__main__":
    ip_CommU = sys.argv[1]
    port_CommU = int(sys.argv[2])
    ip_client = sys.argv[3]
    port_client = int(sys.argv[4])
    send_return = bool(sys.argv[5])
    path_json_behavior = "./behavior.json"

    commu_proxy = CommUProxy(path_json_behavior, 
                        ip_client, port_client,
                        ip_CommU, port_CommU,
                        send_return=True)
    
    commu_proxy.process_message()
# -*- coding: utf-8 -*-
import socket 
import json
import sys
import time


class CommUProxy:
    def __init__(self, path_json_behavior, ip_client, port_client, ip_CommU, port_CommU, send_return=True):
        self.send_return = send_return
        print("waiting client...")
        self.connect_client(ip_client, port_client)
        self.init_CommU(ip_CommU, port_CommU, path_json_behavior)

    def init_CommU(self, ip_CommU, port_CommU, path_json_behavior):
        self.motion = CommU_Motion(ip_CommU, port_CommU, path_json_behavior)
    
    def connect_client(self, ip_client, port_client):
        self.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.sock.bind((ip_client, port_client))
        self.sock.listen(1)
        self.sock.settimeout(100)
        try:
            self.client, self.address_client = self.sock.accept()
            print('success to connect to client. IP:{}, port:{}'.format(self.address_client[0], self.address_client[1]))
        except:
            self.disconnect()

    def wait_message(self,buffer_size=1024):
        try:
            json_message = self.client.recv(buffer_size).decode()
        except:
            print("vital error has occured")
            self.disconnect()
        try:
            message = json.loads(json_message)
            print(type(message))
            return message
        except:
            self.return_message('{"result":"message has some wrong"}')
            return None

    def process_message(self):
        while(1):
            print('waiting message')
            message = self.wait_message()
            if message==None:
                pass
            else:
                print('recieved message:{}'.format(message))
                (message_type, value)  = list(message.items())[0]

                result_value = "something is wrong"
                try:
                    if message_type=='playmotion':
                        result_value = self.motion.play(value)

                    self.return_message('{"result":%s}' % result_value)

                except:
                    self.return_message('{"result":%s}' % result_value)
                        

    def return_message(self,message):
        if self.send_return:
            self.client.send(message.encode("utf-8"))
        else:
            pass

    
class CommU_Motion:
    def __init__(self, ip_CommU, port_CommU, path_json_behavior):
        json_behavior = open(path_json_behavior,'r')
        behavior = json.load(json_behavior)
        self.playmotion = behavior["playmotion"]
        self.ip_CommU = ip_CommU
        self.port_CommU = port_CommU


    def play(self, key_motion):
        if key_motion in self.playmotion.keys():
            try:
                client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
                client_socket.connect((self.ip_CommU, self.port_CommU))
                print("conecction is successed.")
                # send message to proxy
                path_class = self.playmotion[key_motion]
                client_socket.send(path_class.encode("utf-8") + "\n".encode("utf-8"))
                recieved_message = client_socket.recv(1024)
                print(recieved_message)
                client_socket.close()

                return "succeed-end"

            except KeyboardInterrupt:
                client_socket.close()
                return "can't handle the message"

    def exit(self):
        self.frame.cleanBehaviors()
    




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
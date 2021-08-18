package main;

import jp.vstone.network.*;

public class Server {
    public static TCPIPServer tcpipServer;

    Server(int port, int wait_ms){
        tcpipServer = new TCPIPServer(port, wait_ms);
    }

    public static String recieve(){
        String recvString = tcpipServer.waitRequest();
        return recvString;
    }
}

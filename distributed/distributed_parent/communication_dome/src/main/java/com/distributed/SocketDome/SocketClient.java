package com.distributed.SocketDome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//读服务端数据
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);//往服务端写数据
            writer.println("hello,我是客户端");
            while (true) {
                String serverData = reader.readLine();
                if (serverData == null) {
                    break;
                }
                System.out.println("客户端接收到的数据" + serverData);
            }
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

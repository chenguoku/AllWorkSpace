package com.distributed.SocketDome;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8888); //启动一个服务
            while (true) {
                Socket socket = serverSocket.accept();//等待一个接收请求
                new Thread(() -> {
                    try{
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                        while (true) {
                            String clientData = reader.readLine();
                            if (clientData == null) {
                                break;
                            }
                            System.out.println("服务端接收到的数据" + clientData);
                            writer.println("我是服务端");
                            writer.flush();
                        }
                    }catch (Exception e){
                    }
                }).start();
            }

        } catch (Exception e) {
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}

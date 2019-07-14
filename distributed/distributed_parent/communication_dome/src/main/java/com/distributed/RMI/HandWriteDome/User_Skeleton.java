package com.distributed.RMI.HandWriteDome;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * serverSocket
 */
public class User_Skeleton extends Thread {

    private UserServer userServer;

    public User_Skeleton(UserServer userServer){
        this.userServer = userServer;
    }

    @Override
    public void run() {
        ServerSocket serverSocket = null;
        try{

            serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();

            while (true){
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                String str = (String) objectInputStream.readObject();
                if (str.equals("age")){
                    int age = userServer.getAge();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream.writeInt(age);
                    objectOutputStream.flush();

                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

package com.distributed.RMI.HandWriteDome;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class User_Stub extends User {

    private Socket socket;

    public User_Stub() throws IOException {
        socket = new Socket("localhost",8888);
    }

    public int getAge() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject("age");
        objectOutputStream.flush();

        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        return objectInputStream.readInt();
    }
}

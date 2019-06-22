package com.distributed.MulticastDome;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.concurrent.TimeUnit;

public class MulticastServer {

    public static void main(String[] args) {
        try {
            //224.0.0.0 - 239.255.255.255
            InetAddress group = InetAddress.getByName("224.5.6.7");

            MulticastSocket socket = new MulticastSocket();

            for (int i = 0; i < 10; i++) {
                String data = "Hello";
                byte[] bytes = data.getBytes();
                socket.send(new DatagramPacket(bytes, bytes.length, group, 8888));
                TimeUnit.SECONDS.sleep(2);
            }

        } catch (Exception e) {

        }

    }

}

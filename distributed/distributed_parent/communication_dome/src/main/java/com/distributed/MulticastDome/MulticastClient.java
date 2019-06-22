package com.distributed.MulticastDome;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastClient {

    public static void main(String[] args) {

        try{

            InetAddress group = InetAddress.getByName("224.5.6.7");

            MulticastSocket socket = new MulticastSocket(8888);

            socket.joinGroup(group); //加到指定的组里面

            byte[] bytes = new byte[256];
            while (true){
                DatagramPacket msgPacket = new DatagramPacket(bytes,bytes.length);
                socket.receive(msgPacket);

                String msg = new String(msgPacket.getData());
                System.out.println("接收到的数据："+msg);
            }

        }catch (Exception e){

        }


    }

}

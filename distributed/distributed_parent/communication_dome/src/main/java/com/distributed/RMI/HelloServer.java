package com.distributed.RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloServer {

    public static void main(String[] args) {
        try {
            ISayHello hello = new ISayHelloImpl();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/sayHello",hello);

            System.out.println("server start success");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }


    }

}

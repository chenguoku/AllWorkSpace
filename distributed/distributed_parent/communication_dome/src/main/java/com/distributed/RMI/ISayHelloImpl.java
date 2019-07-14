package com.distributed.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ISayHelloImpl extends UnicastRemoteObject implements ISayHello {

    public ISayHelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "hello hh -> "+name;
    }
}

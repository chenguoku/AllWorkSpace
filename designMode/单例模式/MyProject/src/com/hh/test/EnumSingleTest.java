package com.hh.test;

import com.hh.single.register.EnumSingle;
import com.hh.single.seriable.SeriableSingle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName EnumSingleTest.java
 * @Description TODO
 * @createTime 2019年11月16日
 */
public class EnumSingleTest {
    public static void main(String[] args) {
//        EnumSingle instance = EnumSingle.INSTANCE;
//        EnumSingle instance1 = EnumSingle.getInstance();
//
//        instance.setData("111");
//
//        System.out.println(instance.getData());
//        System.out.println(instance1.getData());


        EnumSingle instance = EnumSingle.getInstance();
        SeriableSingle instance1;
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(instance);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            instance1 = (SeriableSingle)objectInputStream.readObject();

            System.out.println(instance);
            System.out.println(instance1);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
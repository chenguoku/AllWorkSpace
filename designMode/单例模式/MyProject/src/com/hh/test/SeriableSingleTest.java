package com.hh.test;

import com.hh.single.seriable.SeriableSingle;

import java.io.*;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName SeriableSingleTest.java
 * @Description TODO
 * @createTime 2019年11月16日
 */
public class SeriableSingleTest {
    public static void main(String[] args) {
        SeriableSingle instance = SeriableSingle.getInstance();
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

//            String string = JSON.toJSONString(instance);
//            instance1 = JSON.parseObject(string, SeriableSingle.class);
//            System.out.println(instance);
//            System.out.println(instance1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
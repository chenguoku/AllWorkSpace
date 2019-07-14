package com.distributed.Serializable;

import java.io.*;

public class SerializableDemo {

    public static void main(String[] args) {
        //序列化操作
//        SerializePerson();
        //反序列化操作
        DeSerializePerson();
    }

    private static void SerializePerson(){
        try {
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("person")));
            Person person = new Person();
            person.setName("chen");
            person.setAge(24);
            person.height = 5;
            oo.writeObject(person);

            System.out.println("序列化成功！");

            oo.close();
        }catch (Exception e){

        }
    }

    private static void DeSerializePerson(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("person")));
            Person person = (Person) ois.readObject();
            System.out.println(person.height);
            System.out.println(person);
        }catch (Exception e){

        }
    }

}

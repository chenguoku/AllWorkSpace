package com.hh.prototype;

import java.io.*;
import java.util.List;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName Prototype.java
 * @Description TODO
 * @createTime 2019年11月19日 00:27:00
 */
public class Prototype implements Cloneable, Serializable {
    private int age;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

//    @Override
//    protected Prototype clone() throws CloneNotSupportedException {
//        Prototype prototype = new Prototype();
//        prototype.setAge(this.age);
//        prototype.setHobbies(this.hobbies);
//        return prototype;
//    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Prototype prototype = (Prototype) ois.readObject();
            return prototype;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

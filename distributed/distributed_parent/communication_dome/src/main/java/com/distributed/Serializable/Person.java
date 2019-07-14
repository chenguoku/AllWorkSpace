package com.distributed.Serializable;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -6762090468543813523L;

    public static int height = 2;   //静态变量不参与序列化

//    private transient String name;  //transient关键字，可以使该字段不参与序列化
    @Protobuf(fieldType = FieldType.STRING,order = 1) //注解用于Protobuf序列化
    private String name;  //transient关键字，可以使该字段不参与序列化

    @Protobuf(fieldType = FieldType.INT32,order = 2)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

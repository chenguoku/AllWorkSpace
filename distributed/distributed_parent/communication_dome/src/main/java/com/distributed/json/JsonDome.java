package com.distributed.json;

import com.alibaba.fastjson.JSON;
import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import com.distributed.Serializable.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JsonDome {

    private static Person init() {
        Person person = new Person();
        person.setName("陈国库");
        person.setAge(24);
        return person;
    }

    public static void main(String[] args) throws IOException {
        excuteWithJack();
        excuteWithFastJson();
        excuteWithProtoBuf();
        excuteWithHessian();
    }

    private static void excuteWithJack() throws IOException {
        Person person = init();

        ObjectMapper objectMapper = new ObjectMapper();
        byte[] writeBytes = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            writeBytes = objectMapper.writeValueAsBytes(person);
        }
        System.out.println("Jack序列化：" + (System.currentTimeMillis() - start) + "ms,总大小：" + writeBytes.length);

        Person person1 = objectMapper.readValue(writeBytes, Person.class);
        System.out.println(person1);

    }

    private static void excuteWithFastJson() {
        Person person = init();

        String text = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            text = JSON.toJSONString(person);
        }
        System.out.println("FastJson序列化：" + (System.currentTimeMillis() - start) + "ms,总大小：" + text.getBytes().length);


        Person person1 = JSON.parseObject(text, Person.class);
        System.out.println(person1);
    }

    private static void excuteWithProtoBuf() throws IOException {
        Person person = init();

        Codec<Person> codec = ProtobufProxy.create(Person.class);
        byte[] bytes = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            bytes = codec.encode(person);
        }
        System.out.println("ProtoBuf序列化：" + (System.currentTimeMillis() - start) + "ms,总大小：" + bytes.length);

        Person person1 = codec.decode(bytes);
        System.out.println(person1);
    }

    private static void excuteWithHessian() throws IOException {
        Person person = init();

        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        HessianOutput ho = new HessianOutput(bao);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            ho.writeObject(person);
        }
        System.out.println("Hessian序列化：" + (System.currentTimeMillis() - start) + "ms,总大小：" + bao.toByteArray().length);
        HessianInput hi = new HessianInput(new ByteArrayInputStream(bao.toByteArray()));
        Person person1 = (Person) hi.readObject();
        System.out.println(person1);
    }

}

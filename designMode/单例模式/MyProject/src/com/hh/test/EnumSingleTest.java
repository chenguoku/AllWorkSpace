package com.hh.test;

import com.hh.single.register.EnumSingle;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName EnumSingleTest.java
 * @Description TODO
 * @createTime 2019年11月16日
 */
public class EnumSingleTest {
    public static void main(String[] args) {
        EnumSingle instance = EnumSingle.INSTANCE;
        EnumSingle instance1 = EnumSingle.getInstance();

        instance.setData("111");

        System.out.println(instance.getData());
        System.out.println(instance1.getData());
    }
}
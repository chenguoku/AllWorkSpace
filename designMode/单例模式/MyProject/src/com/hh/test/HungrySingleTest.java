package com.hh.test;

import com.hh.single.hunger.HungrySingle;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName HungrySingleTest.java
 * @Description TODO
 * @createTime 2019年11月15日 22:51:00
 */
public class HungrySingleTest {
    public static void main(String[] args) {
        HungrySingle instance1 = HungrySingle.getInstance();
        HungrySingle instance2 = HungrySingle.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}

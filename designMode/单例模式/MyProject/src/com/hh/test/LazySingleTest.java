package com.hh.test;

import com.hh.single.lazy.LazySingle;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LazySingleTest.java
 * @Description TODO
 * @createTime 2019年11月15日 23:46:00
 */
public class LazySingleTest {
    public static void main(String[] args) {
//        LazySingle instance = LazySingle.getInstance();
//        LazySingle instance1 = LazySingle.getInstance();
//        System.out.println(instance);
//        System.out.println(instance1);

        Thread thread1 = new Thread(new ExceutorThread());
        Thread thread2 = new Thread(new ExceutorThread());

        thread1.start();
        thread2.start();

        System.out.println("end");
    }
}

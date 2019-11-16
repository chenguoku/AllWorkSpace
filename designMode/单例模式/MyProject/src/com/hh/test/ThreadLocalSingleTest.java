package com.hh.test;

import com.hh.single.ThreadLocal.ThreadLocalSingle;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName ThreadLocalSingleTest.java
 * @Description TODO
 * @createTime 2019年11月17日 00:31:00
 */
public class ThreadLocalSingleTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingle.getInstance());
        System.out.println(ThreadLocalSingle.getInstance());
        System.out.println(ThreadLocalSingle.getInstance());

        Thread thread = new Thread(new ExceutorThread());
        Thread thread1 = new Thread(new ExceutorThread());

        thread.start();
        thread1.start();

        System.out.println("end");

    }
}

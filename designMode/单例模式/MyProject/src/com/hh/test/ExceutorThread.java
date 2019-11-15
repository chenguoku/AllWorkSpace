package com.hh.test;

import com.hh.single.lazy.LazySingle;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName ExceutorThread.java
 * @Description TODO
 * @createTime 2019年11月15日 23:49:00
 */
public class ExceutorThread implements Runnable {
    @Override
    public void run() {
        LazySingle instance = LazySingle.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}

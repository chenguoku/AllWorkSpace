package com.hh.dome.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ClassName TestCallback
 * @Descript 测试callback
 * @Author chenguoku
 * @Date 2019/1/24  17:22
 * @Version 1.0
 **/
public class TestCallable {

    static class CallableThreadTest implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "   " + i);
            }
            return i;
        }
    }

    public static void main(String[] args) {
        CallableThreadTest ctt = new CallableThreadTest();
        FutureTask<Integer> ft = new FutureTask<>(ctt);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            if (i == 20) {
                new Thread(ft, "有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值" + ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

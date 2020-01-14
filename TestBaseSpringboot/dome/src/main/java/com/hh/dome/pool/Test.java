package com.hh.dome.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年01月14日
 */
public class Test {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 1000; i++) {
            executorService.execute(() -> {
                try {
                    LookHomeResultVo lookHomeResultVo = MyPoolFactory.borrowObject();
                    System.out.println(lookHomeResultVo.getPageNo());
                    Thread.sleep(1000);
                    MyPoolFactory.returnObject(lookHomeResultVo);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

    }

}
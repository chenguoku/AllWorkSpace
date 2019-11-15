package com.hh.single.lazy;

import java.util.concurrent.Executors;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LazySingle.java
 * @Description TODO
 * @createTime 2019年11月15日 23:43:00
 */
public class LazySingle {
    private static LazySingle lazySingle;

    private LazySingle() {
    }

    public static synchronized LazySingle getInstance() {
        if (lazySingle == null) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}

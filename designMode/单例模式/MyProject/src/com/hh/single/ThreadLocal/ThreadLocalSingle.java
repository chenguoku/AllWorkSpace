package com.hh.single.ThreadLocal;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName ThreadLocalSingle.java
 * @Description TODO
 * @createTime 2019年11月17日 00:26:00
 */
public class ThreadLocalSingle {

    private static final ThreadLocal<ThreadLocalSingle> threadLocalInstance = new ThreadLocal<ThreadLocalSingle>() {
        @Override
        protected ThreadLocalSingle initialValue() {
            return new ThreadLocalSingle();
        }
    };

    private ThreadLocalSingle() {
    }

    public static ThreadLocalSingle getInstance() {
        return threadLocalInstance.get();
    }

}

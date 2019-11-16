package com.hh.single.lazy;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LazyInnerClassSingle.java
 * @Description TODO
 * @createTime 2019年11月16日
 */
public class LazyInnerClassSingle {
    private LazyInnerClassSingle() {

    }

    public static LazyInnerClassSingle getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingle LAZY = new LazyInnerClassSingle();
    }
}
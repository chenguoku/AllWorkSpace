package com.hh.single.seriable;

import java.io.Serializable;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName SeriableSingle.java
 * @Description 避免序列化 破话单例
 * @createTime 2019年11月16日
 */
public class SeriableSingle implements Serializable {
    private final static SeriableSingle instance = new SeriableSingle();

    private SeriableSingle() {
    }

    public static SeriableSingle getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

}
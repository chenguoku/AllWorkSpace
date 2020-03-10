package com.hh.dome.test;

import com.alibaba.fastjson.JSON;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName DeepCloneDemo.java
 * @Description TODO
 * @createTime 2020年03月01日 12:11:00
 */
public class DeepCloneDemo {

    public DeepCloneDemo deepClone(DeepCloneDemo deepCloneDemo) {
        String string = JSON.toJSONString(deepCloneDemo);
        return JSON.parseObject(string, DeepCloneDemo.class);
    }

}

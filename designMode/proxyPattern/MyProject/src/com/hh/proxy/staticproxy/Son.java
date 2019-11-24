package com.hh.proxy.staticproxy;

import com.hh.proxy.Person;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName Son.java
 * @Description TODO
 * @createTime 2019年11月20日 23:58:00
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("肤白 貌美 大长腿");
    }
}

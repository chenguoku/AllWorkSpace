package com.hh.proxy.staticproxy;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName StaticProxyTest.java
 * @Description TODO
 * @createTime 2019年11月21日 00:01:00
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}

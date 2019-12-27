package com.hh.proxy.cglib;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName CglibProxyTest.java
 * @Description TODO
 * @createTime 2019年11月21日 01:02:00
 */
public class CglibProxyTest {
    public static void main(String[] args) {

        Boy boy = (Boy) new CglibMeipo().getInstance(Boy.class);
        boy.findLove();

    }
}

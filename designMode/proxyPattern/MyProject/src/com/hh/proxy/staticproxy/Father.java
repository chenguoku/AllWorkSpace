package com.hh.proxy.staticproxy;

import com.hh.proxy.Person;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName Father.java
 * @Description TODO
 * @createTime 2019年11月20日 23:58:00
 */
public class Father implements Person {
    private Person person;

    public Father(Son son) {
        this.person = son;
    }

    @Override
    public void findLove() {
        before();
        person.findLove();
        after();
    }

    private void before() {
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("寻找完毕");
    }
}

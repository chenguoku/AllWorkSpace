package com.hh.dome.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName B.java
 * @Description TODO
 * @createTime 2020年02月05日 11:18:00
 */
@Service
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class B {

    @Autowired
    private A a;

    public void test() {
        System.out.println("B");
        System.out.println(A.class);
    }

}

package com.hh.dome.test;

import org.springframework.stereotype.Component;

/**
 * @ClassName Test
 * @Author chenguoku
 * @Date 2019/1/21  17:17
 * @Version 1.0
 **/
@Component
public class Test {

    public int testOne(){
        System.out.println("testOne");
        return 1;
    }

    public String testTwo(){
        System.out.println("testTwo");
        return "two";
    }

}

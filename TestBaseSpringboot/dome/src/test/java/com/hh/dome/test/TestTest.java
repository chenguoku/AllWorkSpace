package com.hh.dome.test;

import com.hh.dome.TmallApplicationTests;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;



public class TestTest extends TmallApplicationTests {

    @Autowired
    private Test test;

    @org.junit.Test
    public void testOne(){
        Assert.assertSame(1,test.testOne());
    }

    @org.junit.Test
    public void testTwo(){
        Assert.assertSame("2222","1",test.testTwo());
    }

}

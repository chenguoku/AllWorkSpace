package com.hh.dome.lambda;


import com.hh.dome.TmallApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Steam1Test extends TmallApplicationTests {

    @Autowired
    private Steam1 steam1;

    @Test
    public void testOne(){
        steam1.testOne();
    }

    @Test
    public void testTwo(){
        steam1.testTwo();
    }

    @Test
    public void testThree(){
        steam1.testThree();
    }

    @Test
    public void testFour(){
        steam1.testFour();
    }

    @Test
    public void testFive(){
        steam1.testFive();
    }

    @Test
    public void testSix(){
        steam1.testSix();
    }
}

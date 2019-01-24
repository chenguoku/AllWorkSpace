package com.hh.dome.lambda;

import com.hh.dome.TmallApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class LambdaAndAnonymous1Test extends TmallApplicationTests {

    @Autowired
    LambdaAndAnonymous1 lambdaAndAnonymous1;

    @Test
    public void testOne(){
        lambdaAndAnonymous1.testOne();
        System.out.println("222");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTwo(){
        lambdaAndAnonymous1.testTwo();
    }

    @Test
    public void testThree(){
        lambdaAndAnonymous1.testThree();
    }

}

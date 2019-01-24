package com.hh.dome.lambda;


import com.hh.dome.TmallApplicationTests;
import com.hh.dome.lambda.Stream2;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Stream2Test extends TmallApplicationTests {

    @Autowired
    private Stream2 stream2;

    @Test
    public void testOne(){
        stream2.testOne();
    }

}

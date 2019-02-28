package com.hh.dome.async;

import com.hh.dome.TmallApplicationTests;

import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskTest extends TmallApplicationTests {

    @Autowired
    private Task task;
    public static Random random =new Random();
    @Test
    public void test() throws Exception{
        try{
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("11");
        Thread.sleep(random.nextInt(10000));
    }

    @Test
    public void test2(){
        System.out.println("111");
    }
}
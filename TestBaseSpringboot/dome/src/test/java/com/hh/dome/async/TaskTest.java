package com.hh.dome.async;

import com.hh.dome.TmallApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskTest extends TmallApplicationTests {

    @Autowired
    private Task task;

    @Test
    public void test(){
        try{
            task.doTaskOne();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("11");
    }

    @Test
    public void test2(){
        System.out.println("111");
    }
}
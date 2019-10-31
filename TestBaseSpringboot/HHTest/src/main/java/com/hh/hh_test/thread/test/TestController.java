package com.hh.hh_test.thread.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description TODO
 * @createTime 2019年10月30日
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("test")
    public String test(){
        System.out.println("test");
        return "hello world";
    }

}
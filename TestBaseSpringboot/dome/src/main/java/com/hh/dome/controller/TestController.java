package com.hh.dome.controller;

import com.hh.dome.async.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author chenguoku
 * @Date 2019/1/21  16:39
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private Task task;

    @RequestMapping("/test")
    public int test() {
        try {
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 1;
    }

}

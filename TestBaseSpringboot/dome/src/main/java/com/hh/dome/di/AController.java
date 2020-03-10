package com.hh.dome.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName AController.java
 * @Description TODO
 * @createTime 2020年02月05日 11:24:00
 */
@RestController
public class AController {

    @Autowired
    private A a;

    @GetMapping("testDI")
    public String test(){
        a.test();
        return "hello world";
    }

}

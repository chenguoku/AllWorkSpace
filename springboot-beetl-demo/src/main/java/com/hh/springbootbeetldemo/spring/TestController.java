package com.hh.springbootbeetldemo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: TestController
 * @Description: TestController
 * @Author: chenguoku
 * @Date 2020-10-26
 * @Version V1.0
 */
@RestController
public class TestController {

    @Autowired
    private SpringBootBeetlDemo springBootBeetlDemo;

    @GetMapping("test")
    public String test(@RequestParam(name = "path") String path) {
        String string = springBootBeetlDemo.getString(path);
        return string;
    }

}

package com.hh.hh_test.testjvm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description TODO
 * @createTime 2019年12月01日 19:15:00
 */
@RestController
public class TestJVMController {

    private List list = new ArrayList();

    @RequestMapping("test/jvm")
    public void test() {
        while (true) {
            Person person = new Person();
            list.add(person);
        }
    }

}

package com.example.testPrometheus.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestService
 * @Author chenguoku
 * @Date 2019/1/17  10:45
 * @Version 1.0
 **/
@Service
public class TestService {

    public void testService(List<String> list,String id){

        System.out.println(list.size()+"#####"+id);

    }

}

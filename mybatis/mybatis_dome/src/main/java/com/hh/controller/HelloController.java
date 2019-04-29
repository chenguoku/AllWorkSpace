package com.hh.controller;

import com.hh.dao.Sc;
import com.hh.dao.ScExample;
import com.hh.dao.Student;
import com.hh.dao.StudentExample;
import com.hh.mapper.ScMapper;
import com.hh.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private ScMapper scMapper;

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/1")
    public String hello1(){
        ScExample example = new ScExample();
        ScExample.Criteria criteria = example.createCriteria();
        criteria.andCidIsNotNull();
        List<Sc> list = scMapper.selectByExample(example);
        return list.get(0).getScore()+"123";
//        return "";
    }

    @RequestMapping("/2")
    public String hello2(){
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andSageIsNotNull();
        List<Student> list = studentMapper.selectByExample(example);
        return list.get(0).getSname()+"";
    }

}

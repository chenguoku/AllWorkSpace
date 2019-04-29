package com.hh.test;

import com.hh.dao.Student;
import com.hh.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class TestTypehandler extends BaseApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testTypeHandler(){

        Student student = new Student();
        student.setSid("17");
        student.setSname("测试");
        student.setSage(new Date());
        student.setSsex("男");
        int insert = studentMapper.insert(student);
        System.out.println(insert);
    }

}

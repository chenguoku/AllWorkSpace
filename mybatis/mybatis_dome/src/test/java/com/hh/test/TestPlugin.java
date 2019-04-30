package com.hh.test;

import com.hh.dao.Student;
import com.hh.dao.StudentExample;
import com.hh.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestPlugin extends BaseApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testPlugin(){
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andSageIsNotNull();
        List<Student> list = studentMapper.selectByExample(example);
        System.out.println(list.size());
    }


}

package com.hh.test;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hh.dao.Student;
import com.hh.dao.StudentExample;
import com.hh.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestPageHelper extends BaseApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testPageHelper(){
        //第一种
//        PageHelper.startPage(1,3);
//        StudentExample example = new StudentExample();
//        StudentExample.Criteria criteria = example.createCriteria();
//        criteria.andSageIsNotNull();
//        List<Student> list = studentMapper.selectByExample(example);
//        PageInfo<Student> studentPageInfo = new PageInfo<>(list);
//        System.out.println(studentPageInfo.getSize());

        //第二种
        PageInfo<Object> page =PageHelper.startPage(1, 3).doSelectPageInfo(new ISelect() {
            public void doSelect() {
                StudentExample example = new StudentExample();
                StudentExample.Criteria criteria = example.createCriteria();
                criteria.andSageIsNotNull();
                studentMapper.selectByExample(example);
            }
        });
        System.out.println(page.getSize());
    }

}

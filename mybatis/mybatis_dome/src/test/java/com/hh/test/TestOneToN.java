package com.hh.test;

import com.hh.mapper.ScAndStudentMapper;
import com.hh.resultmap.StudentToScMap;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestOneToN extends BaseApplicationTests {

    @Autowired
    private ScAndStudentMapper scAndStudentMapper;

    @Test
    public void testOneToN1(){
        StudentToScMap studentToScMap = scAndStudentMapper.oneToN1("01");
        System.out.println(studentToScMap);
    }
    @Test
    public void testOneToN2(){
        StudentToScMap studentToScMap = scAndStudentMapper.oneToN2("01");
        System.out.println(studentToScMap);
    }

}

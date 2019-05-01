package com.hh.test;

import com.hh.mapper.ScAndStudentMapper;
import com.hh.resultmap.ScToStudentMap;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestOneToOne extends BaseApplicationTests {

    @Autowired
    private ScAndStudentMapper scAndStudentMapper;

    @Test
    public void testOnetoOne1(){
        ScToStudentMap scToStudentMap = scAndStudentMapper.oneToOne1("01");
        System.out.println(scToStudentMap.toString());
    }

    @Test
    public void testOneToOne2(){
        ScToStudentMap scToStudentMap = scAndStudentMapper.oneToOne2("01");
        System.out.println(scToStudentMap);
    }

}

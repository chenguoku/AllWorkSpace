package com.hh.dome.base;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName BaseTest
 * @Descript TODO
 * @Author chenguoku
 * @Date 2019/1/24  11:32
 * @Version 1.0
 **/
public class BaseTest {

    @Test
    public void testOne() {
        String str1 = "1 ";
        String str2 = "2";

        System.out.println(str1.concat(str2));

    }

    @Test
    public void testThree(){
        String xixi = String.format("%s haha", "xixi");
        System.out.println(xixi);
    }

    @Test
    public void testFour(){
        String[] str1 = new String[5];
        String[] str2 = {"1","2","3","4","5","6"};
        int i = Arrays.binarySearch(str2, "3");
        System.out.println(i);
    }

}

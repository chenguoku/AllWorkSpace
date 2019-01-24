package com.hh.dome.regex;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * @ClassName TestRegex1
 * @Descript TODO
 * @Author chenguoku
 * @Date 2019/1/24  11:46
 * @Version 1.0
 **/
public class TestRegex1 {

    @Test
    public void testOne(){
        String string = "I love you too";
        String pattren = ".*you.*";
        boolean matches = Pattern.matches(pattren, string);
        System.out.println(matches);
    }

    @Test
    public void testTwo(){
        Integer max = max(1, 2, 3, 4, 5, 6);
        System.out.println(max);
    }


    public Integer max(Integer... arr){
        if (arr.length == 0){
            return 0;
        }
        Integer max = arr[0];

        for (int i = 1;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}

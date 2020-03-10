package com.hh.dome.sort;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年01月30日 14:46:00
 */
public class Test {
    public static void main(String[] args) {
        boolean powerOf2 = isPowerOf2(7);
        System.out.println(powerOf2);
    }

    public static boolean isPowerOf2(int num){
        return (num&num-1) == 0;
    }
}

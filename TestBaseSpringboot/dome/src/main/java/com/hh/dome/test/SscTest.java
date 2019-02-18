package com.hh.dome.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SscTest
 * @Descript TODO
 * @Author chenguoku
 * @Date 2019/1/25  11:51
 * @Version 1.0
 **/
public class SscTest {

    @Test
    public void testOne() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(7);
        list.add(1);
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(0);
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(0);
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(0);
        list.add(3);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);


        for (int i = 5; i < list.size(); i++) {
            int sum = list.get(i-1)+list.get(i-2)+list.get(i-3)+list.get(i-4)+list.get(i-5);
            System.out.println(sum);
        }

    }

    @Test
    public void testTwo(){
        ArrayList<String> list = new ArrayList<>();

        list.add("1890760724");
        list.add("1604281826");
        list.add("1546986047");
        list.add("1604281826");
        list.add("1661577606");
        list.add("1489690267");
        list.add("1432394488");
        list.add("1375098708");
        list.add("1031324031");
        list.add("114591559");
        list.add("1088619811");
        list.add("1088619811");
        list.add("1088619811");
        list.add("1088619811");
        list.add("9167324722");
        list.add("1031324031");
        list.add("9740282517");
        list.add("114591559");
        list.add("120321137");
        list.add("9740282517");
        list.add("1375098708");
        list.add("1604281826");
        list.add("1432394488");
        list.add("120321137");
        list.add("1260507149");
        list.add("7448451337");
        list.add("6302535746");
        list.add("3437746771");
        list.add("4010704566");



        for (String s:list){
            Set<Integer> set = new HashSet<>();
            for (int i = 0;i<s.length();i++){
                char c = s.charAt(i);
                int ci = Integer.parseInt(c + "");
                set.add(ci);
            }
            for (int i: set) {
                System.out.print(i);
            }
            System.out.println();
        }

    }


}

package com.hh.dome.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName GenericMethodTest
 * @Descript 泛型
 * @Author chenguoku
 * @Date 2019/1/23  16:45
 * @Version 1.0
 **/
public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray){
        List<E> list = Arrays.asList(inputArray);
        list.forEach(System.out::println);
    }

    public static <E extends Comparable<E>> E maximum(E x ,E y,E z){
        E max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }


    @Test
    public void testOne(){
//        String [] strings = {"1","2","3"};
//        Integer[] integers = {1,2,3};
        TestObj[] testObj = {new TestObj("1"),new TestObj("43"),new TestObj("213")};
        printArray(testObj);
    }

    @Test
    public void testThree(){
        System.out.println(maximum(1, 3, 3));
        System.out.println(maximum("I","love","you"));
//        System.out.println(maximum(new TestObj("1"),new TestObj("43"),new TestObj("213")));
    }

    @Test
    public void testFour(){
        TestObj<String> obj1 = new TestObj<>("222");
        TestObj<Integer> obj2 = new TestObj<>("111");
        TestObj<Object> obj3 = new TestObj<>("333");

//        testMethod(obj1);
        testMethod(obj2);
//        testMethod(obj3);

//        testMethodTwo(obj1);
//        testMethodTwo(obj2);
        testMethodTwo(obj3);

    }

    public void testMethod(TestObj<? extends Number> obj){
        System.out.println(obj.toString());
    }

    public void testMethodTwo(TestObj<? super Number> obj){
        System.out.println(obj.toString());
    }

    class TestObj<E> {
        private String name;

        public TestObj(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "TestObj{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }
}

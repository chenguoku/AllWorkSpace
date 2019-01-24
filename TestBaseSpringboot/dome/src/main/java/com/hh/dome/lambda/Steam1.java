package com.hh.dome.lambda;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName Steam1
 * @Descript TODO
 * @Author chenguoku
 * @Date 2019/1/22  17:24
 * @Version 1.0
 **/
@Component
public class Steam1 {

    /**
     * @Author chenguoku
     * @Description 测试 forEach
     * @Date 17:27 2019/1/22
     * @Param []
     * @return void
     **/
    public void testOne(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.forEach(str -> System.out.println(str));
    }

    /**
     * @Author chenguoku
     * @Description 测试 filter
     * @Date 17:28 2019/1/22
     * @Param []
     * @return void
     **/
    public void testTwo(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.filter(str -> str.length() == 3)
                .forEach(str -> System.out.println(str));
    }

    /**
     * @Author chenguoku
     * @Description 测试 distinct
     * @Date 17:30 2019/1/22
     * @Param []
     * @return void
     **/
    public void testThree(){
        Stream<String> stream = Stream.of("I", "love", "you", "too","too");
        stream.distinct()
                .forEach(str -> System.out.println(str));
    }

    /**
     * @Author chenguoku
     * @Description 测试 sorted
     * @Date 17:36 2019/1/22
     * @Param []
     * @return void
     **/
    public void testFour(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.sorted()
                .forEach(str -> System.out.println(str));
        System.out.println("####################");
        Stream<String> stream2 = Stream.of("I", "love", "you", "too");
        stream2.sorted((str1,str2) -> str1.length() - str2.length())
                .forEach(str -> System.out.println(str));
    }

    /**
     * @Author chenguoku
     * @Description 测试 map
     * @Date 17:37 2019/1/22
     * @Param []
     * @return void
     **/
    public void testFive(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.map(x -> {
            return x.toUpperCase();
        }).forEach(str -> System.out.println(str));
    }

    /**
     * @Author chenguoku
     * @Description 测试 flatMap
     * @Date 17:39 2019/1/22
     * @Param []
     * @return void
     **/
    public void testSix(){
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1,2),Arrays.asList(3,4));
        stream.flatMap(list -> list.stream())
                .forEach(str -> System.out.println(str));
    }
}

package com.hh.dome.lambda;

import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Stream2
 * @Descript TODO
 * @Author chenguoku
 * @Date 2019/1/22  17:55
 * @Version 1.0
 **/
@Component
public class Stream2 {

    /**
     * @Author chenguoku
     * @Description 测试 reduce 找出最大值
     * @Date 17:56 2019/1/22
     * @Param []
     * @return void
     **/
    @Test
    public void testOne(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        Optional<String> s = stream.reduce((x1, x2) -> x1.length() > x2.length() ? x1 : x2);
        Optional<String> s = stream.max((x1, x2) -> x1.length() - x2.length() );
        System.out.println(s.toString());
    }

    /**
     * @Author chenguoku
     * @Description reduce 求和
     * @Date 14:23 2019/1/23
     * @Param []
     * @return void
     **/
    @Test
    public void testTwo(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        Integer sum = stream.reduce(0,
//                (sum, str) -> sum + str.length(),
//                (a, b) -> a + b);
        int sum = stream.mapToInt(str -> str.length()).sum();
        System.out.println(sum);
    }

    @Test
    public void testThree(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        List<String> list = stream.collect(Collectors.toList());
//        Set<String> collect = stream.collect(Collectors.toSet());
        Map<String, Integer> collect = stream.collect(Collectors.toMap(Function.identity(), String::length));

        collect.forEach((k,v)-> System.out.println(k+"---"+v));
//        list.forEach(System.out::println);
    }

    @Test
    public void testFour(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        List<String> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        List<String> list = stream.collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    @Test
    public void testFive(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        List<String> list = stream.collect(Collectors.toList());
//        list.forEach(System.out::println);

        Set<String> set = stream.collect(Collectors.toSet());
        set.forEach(System.out::println);
    }

    @Test
    public void testSix(){
        Stream<String> stream = Stream.of("I", "love", "you", "too");

        HashSet<String> collect = stream.collect(Collectors.toCollection(HashSet::new));
        collect.forEach(System.out::println);
    }

    @Test
    public void testSeven(){
        Stream<String> stream = Stream.of("I", "love", "you");
//        String collect = stream.collect(Collectors.joining());
//        String collect = stream.collect(Collectors.joining(","));
        String collect = stream.collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect);
    }
}

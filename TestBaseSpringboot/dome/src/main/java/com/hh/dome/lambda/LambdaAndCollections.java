package com.hh.dome.lambda;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName LambdaAndCollections
 * @Descript TODO
 * @Author chenguoku
 * @Date 2019/1/22  15:37
 * @Version 1.0
 **/
@Component
public class LambdaAndCollections {

    public void testOne(){
        List<String> list = Arrays.asList("I","love","you","too");
        list.forEach(str -> {
            if (str.length() > 3){
                System.out.println(str);
            }
        });
    }

    public void testTwo(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I","love","you","too"));
        list.removeIf(str -> {
            return str.length() > 3 ;
        });
        list.forEach(str -> System.out.println(str));
    }

    public void testThree(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I","love","you","too"));
        list.replaceAll(str -> {
            if (str.length() > 3){
                return str.toUpperCase();
            }
            return str;
        });
        list.forEach(str -> System.out.println(str));
    }

    public void testFour(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I","love","you","too"));
        list.sort((x1,x2) -> {
            return x1.length() - x2.length();
        });
        list.forEach(str -> System.out.println(str));
    }

    public void testFive(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.forEach((k,v) -> {
            System.out.println( k +"---"+ v);
        });
    }

    public void testSix(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map.getOrDefault(4,"NoValue"));
    }

    public void testSeven(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.putIfAbsent(2,"haha");
        map.forEach((k,v) -> {
            System.out.println( k +"---"+ v);
        });
    }

    public void testEight(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.replaceAll((k,v) -> {
           return v.toUpperCase();
        });

        map.forEach((k,v)->{
            System.out.println(k+"----"+v);
        });
    }

    public void testNine(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);

        map.merge(1,2,(x1,x2)-> x1+x2);

        map.forEach((k,v)->{
            System.out.println(k +"----"+v);
        });
    }

    public void testTen(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.compute(2,(k,v) -> {
            return v.concat("haha");
        });
        map.forEach((k,v)->{
            System.out.println(k +"---"+v);
        });
    }

    public void testEleven(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, null);
        map.put(3, "three");

        map.computeIfAbsent(2,v -> "222");
        map.computeIfAbsent(3,x -> "333");
        map.computeIfAbsent(4,x -> "444");

        map.forEach((k,v) -> {
            System.out.println(k +"---"+v);
        });
    }

    public void testTwelve(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, null);
        map.put(3, "three");

        map.computeIfPresent(2,(k,v) -> "222");
        map.computeIfPresent(3,(k,v) -> "333");
        map.computeIfPresent(4,(k,v) -> "444");

        map.forEach((k,v) -> {
            System.out.println(k +"---"+v);
        });
    }

}

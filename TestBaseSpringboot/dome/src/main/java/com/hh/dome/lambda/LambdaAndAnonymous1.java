package com.hh.dome.lambda;

import com.hh.dome.lambda.anonymous.TestClassOne;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author chenguoku
 * @Description 匿名内部类
 * @Date 14:06 2019/1/22
 * @Param
 * @return
 **/
@Component
public class LambdaAndAnonymous1 {

    /**
     * @return void
     * @Author chenguoku
     * @Description 无参函数的简写
     * @Date 14:05 2019/1/22
     * @Param []
     **/
    public void testOne() {
        new Thread(() -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test1");
        }).start();
    }

    /**
     * @return void
     * @Author chenguoku
     * @Description 带参函数的简写
     * @Date 14:31 2019/1/22
     * @Param []
     **/
    public void testTwo() {
        List<String> list = Arrays.asList("I", "love", "you", "too");

        Collections.sort(list, (x1, x2) -> {
            if (x1 == null) {
                return -1;
            }
            if (x2 == null) {
                return 1;
            }
            return x1.length() - x2.length();
        });
        System.out.println(list.toString());
    }

    /**
     * @Author chenguoku
     * @Description 测试 自定义的 接口
     * @Date 14:57 2019/1/22
     * @Param []
     * @return void
     **/
    public void testThree(){
        String str = "test haha";
        TestClassOne<String> one = x -> System.out.println(x);
        one.test(str);
    }

}







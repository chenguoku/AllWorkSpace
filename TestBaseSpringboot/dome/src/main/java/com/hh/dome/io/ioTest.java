package com.hh.dome.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ClassName ioTest
 * @Descript TODO
 * @Author chenguoku
 * @Date 2019/1/24  15:03
 * @Version 1.0
 **/
public class ioTest {

    public static void main(String args[]) throws IOException {
//        testOne();
//        testTwo();
        testThree();
    }

    /**
     * @Author chenguoku
     * @Description 从控制台读取多字符输入
     * @Date 15:09 2019/1/24
     * @Param []
     * @return void
     **/
    public static void testOne() throws IOException {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        do {
            c = (char)bufferedReader.read();
            System.out.println(c);
        }while (c != 'q');
    }

    public static void testTwo() throws IOException {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        }while (str != "quit");
    }

    public static void testThree(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }

}

package com.hh.dome.test;

public class Test {



    public static void main(String[] args) {

        System.out.print(B.c);

    }

}



class A {

    public static String c = "C";

    static {

        System.out.print("A");

    }

}



class B extends A{

    static {

        System.out.print("B");

    }

}


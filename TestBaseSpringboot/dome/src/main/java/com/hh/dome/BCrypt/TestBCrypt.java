package com.hh.dome.BCrypt;

public class TestBCrypt {

    public static void main(String[] args) {

        String password = "1234";
        String bcy = "$2a$10$viOS2a78rRZmNDjhbAsVw.fF1rajDmu.syyw4V83zA2lSAa2vXQK.";

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        boolean matches = bCryptPasswordEncoder.matches(password, bcy);

        System.out.println(matches);
    }

}

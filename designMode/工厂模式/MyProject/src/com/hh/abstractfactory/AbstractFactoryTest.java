package com.hh.abstractfactory;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName AbstractFactoryTest.java
 * @Description TODO
 * @createTime 2019年11月15日
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        INote node = javaCourseFactory.createNode();
        IVideo video = javaCourseFactory.createVideo();
        node.read();
        video.play();
    }
}
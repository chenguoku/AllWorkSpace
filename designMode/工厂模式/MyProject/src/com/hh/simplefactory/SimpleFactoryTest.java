package com.hh.simplefactory;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName SimpleFactoryTest.java
 * @Description TODO
 * @createTime 2019年11月15日 00:17:00
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleCourseFactory simpleCourseFactory = new SimpleCourseFactory();

//        ICourse course = simpleCourseFactory.create("java");
//        course.video();

//        ICourse course = simpleCourseFactory.create("com.hh.simplefactory.JavaCourse");
//        course.video();

        ICourse course = simpleCourseFactory.create(JavaCourse.class);
        course.video();

    }
}

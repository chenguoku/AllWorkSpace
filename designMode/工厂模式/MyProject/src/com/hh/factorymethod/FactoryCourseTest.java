package com.hh.factorymethod;

import com.hh.simplefactory.ICourse;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName FactoryCourseTest.java
 * @Description TODO
 * @createTime 2019年11月15日 00:42:00
 */
public class FactoryCourseTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse iCourse = courseFactory.create();
        iCourse.video();

        courseFactory = new PythonCourseFactory();
        iCourse = courseFactory.create();
        iCourse.video();
    }
}

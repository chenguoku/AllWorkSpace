package com.hh.simplefactory;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName SimpleCourseFactory.java
 * @Description 简单工厂
 * @createTime 2019年11月15日 00:14:00
 */
public class SimpleCourseFactory {

//    public ICourse create(String courseName) {
//        if ("java".equals(courseName)) {
//            return new JavaCourse();
//        } else if ("python".equals(courseName)) {
//            return new PythonCourse();
//        } else {
//            return null;
//        }
//    }

//    public ICourse create(String classPath) {
//        try {
//            if (classPath != null && !"".equals(classPath)) {
//                ICourse course = (ICourse) Class.forName(classPath).newInstance();
//                return course;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (clazz != null) {
                ICourse course = clazz.newInstance();
                return course;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

package com.hh.factorymethod;

import com.hh.simplefactory.ICourse;
import com.hh.simplefactory.JavaCourse;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName JavaCourseFactory.java
 * @Description TODO
 * @createTime 2019年11月15日 00:41:00
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}

package com.hh.factorymethod;

import com.hh.simplefactory.ICourse;
import com.hh.simplefactory.PythonCourse;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName PythonCourseFactory.java
 * @Description TODO
 * @createTime 2019年11月15日 00:42:00
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}

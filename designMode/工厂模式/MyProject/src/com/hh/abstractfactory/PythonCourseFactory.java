package com.hh.abstractfactory;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName PythonCourseFactory.java
 * @Description TODO
 * @createTime 2019年11月15日
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public INote createNode() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
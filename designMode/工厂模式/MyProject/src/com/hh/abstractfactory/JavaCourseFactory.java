package com.hh.abstractfactory;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName JavaCourseFactory.java
 * @Description TODO
 * @createTime 2019年11月15日
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public INote createNode() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
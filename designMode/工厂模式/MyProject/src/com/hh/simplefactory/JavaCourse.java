package com.hh.simplefactory;

import com.hh.simplefactory.ICourse;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName JavaCourse.java
 * @Description TODO
 * @createTime 2019年11月15日 00:12:00
 */
public class JavaCourse implements ICourse {
    @Override
    public void video() {
        System.out.println("Java课程正在播放");
    }
}

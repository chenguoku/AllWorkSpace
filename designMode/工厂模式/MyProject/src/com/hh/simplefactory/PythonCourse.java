package com.hh.simplefactory;

import com.hh.simplefactory.ICourse;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName PythonCourse.java
 * @Description TODO
 * @createTime 2019年11月15日 00:12:00
 */
public class PythonCourse implements ICourse {
    @Override
    public void video() {
        System.out.println("python视频正在播放");
    }
}

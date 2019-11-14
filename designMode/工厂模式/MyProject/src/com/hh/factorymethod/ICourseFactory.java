package com.hh.factorymethod;

import com.hh.simplefactory.ICourse;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName ICourseFactory.java
 * @Description TODO
 * @createTime 2019年11月15日 00:40:00
 */
public interface ICourseFactory {
    ICourse create();
}

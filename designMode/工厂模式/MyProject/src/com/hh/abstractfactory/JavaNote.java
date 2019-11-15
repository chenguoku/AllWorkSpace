package com.hh.abstractfactory;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName JavaNote.java
 * @Description TODO
 * @createTime 2019年11月15日
 */
public class JavaNote implements INote {
    @Override
    public void read() {
        System.out.println("正在读java笔记");
    }
}
package com.hh.abstractfactory;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName PythonVideo.java
 * @Description TODO
 * @createTime 2019年11月15日
 */
public class PythonVideo implements IVideo {
    @Override
    public void play() {
        System.out.println("正在播放Python视频");
    }
}
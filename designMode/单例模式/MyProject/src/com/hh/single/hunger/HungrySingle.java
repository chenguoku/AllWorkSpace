package com.hh.single.hunger;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName HungrySingle.java
 * @Description TODO
 * @createTime 2019年11月15日 22:44:00
 */
public class HungrySingle {

    private static HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle() {
    }

    public static HungrySingle getInstance() {
        return hungrySingle;
    }

}

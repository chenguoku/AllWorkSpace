/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.chaoku.common.utils;

/**
 * Redis所有Keys
 *
 * @author Mark sunlightcs@gmail.com
 */
public class RedisKeys {

    public static String getSysConfigKey(String key) {
        return "sys:config:" + key;
    }

    public static String getHungerNum(String userId) {
        return userId + ":hunger:num";
    }

    public static String getCleanNum(String userId) {
        return userId + ":clean:num";
    }

    public static String getMoodNum(String userId) {
        return userId + ":mood:num";
    }
}

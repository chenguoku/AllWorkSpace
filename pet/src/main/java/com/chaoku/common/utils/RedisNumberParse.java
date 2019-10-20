package com.chaoku.common.utils;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName RedisNumberParse.java
 * @Description redis过期时间 与 数量的转换
 * @createTime 2019年10月18日
 */
public class RedisNumberParse {

    /**
     * 饥饿值 与 过期时间对应值
     * 1个饥饿值  6分钟过期
     * 60s * 6
     */
    private static final Integer HUNGER_TIME_MAPPING = 360;

    /**
     * 清洁值 与 过期时间对应值
     */
    private static final Integer CLEAN_TIME_MAPPING = 1;

    /**
     * 心情值 与 过期时间对应值
     */
    private static final Integer MOOD_TIME_MAPPING = 1;

    /**
     * 获取饥饿值 过期时间
     *
     * @param: foodNum 食物数量
     * @return: java.lang.Long
     * @author: chenguoku
     * @date: 2019/10/18
     */
    public static Long getHungerExpire(Integer foodNum) {
        int i = foodNum * HUNGER_TIME_MAPPING;
        return Long.parseLong(String.valueOf(i));
    }

    /**
     * 解析出 饥饿值
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static Integer parseHungerExpire(Long expire) {
        double ceil = Math.ceil(expire / HUNGER_TIME_MAPPING);
        return Integer.parseInt(String.valueOf(ceil));
    }

    /**
     * 获取清洁值 过期时间
     *
     * @param: cleanNum
     * @return: java.lang.Long
     * @author: chenguoku
     * @date: 2019/10/18
     */
    public static Long getCleanExpire(Integer cleanNum) {
        int i = cleanNum * CLEAN_TIME_MAPPING;
        return Long.parseLong(String.valueOf(i));
    }

    /**
     * 解析出 清洁值
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static Integer parseCleanExpire(Long expire) {
        double ceil = Math.ceil(expire / CLEAN_TIME_MAPPING);
        return Integer.parseInt(String.valueOf(ceil));
    }

    /**
     * 获取心情值过期时间
     *
     * @param: moodNum
     * @return: java.lang.Long
     * @author: chenguoku
     * @date: 2019/10/18
     */
    public static Long getMoodExpire(Integer moodNum) {
        int i = moodNum * MOOD_TIME_MAPPING;
        return Long.parseLong(String.valueOf(i));
    }

    /**
     * 解析出 心情值
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static Integer parseMoodExpire(Long expire) {
        double ceil = Math.ceil(expire / MOOD_TIME_MAPPING);
        return Integer.parseInt(String.valueOf(ceil));
    }
}

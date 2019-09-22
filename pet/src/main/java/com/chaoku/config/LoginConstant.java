package com.chaoku.config;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LoginConstant.java
 * @Description 登录的常量
 * @createTime 2019年09月19日 00:25:00
 */
public interface LoginConstant {

    /**
     * sessionkey 和 openid 的间隔符
     */
    String SESSION_OPEN_SPLIT = "-.-";

    /**
     * sessionkey+openid 和 userId 的间隔符
     */
    String SESSION_OPEN_USER_SPLIT = "#.#";

}

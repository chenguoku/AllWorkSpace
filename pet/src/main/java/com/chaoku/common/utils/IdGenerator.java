package com.chaoku.common.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: chenguoku
 * @Description:雪花算法生成id
 * @Date: 2019/6/19 10:08
 * @Version: V1.0
 */
@Slf4j
public class IdGenerator {

    /**
     * 默认工作器ID - 12L
     **/
    private static final Long DEFAULT_WORKER_ID = 12L;

    /**
     * 默认商城ID - 16L
     **/
    private static final Long DEFAULT_LMSHOP_ID = 16L;

    /**
     * 默认雪花因子
     **/
    public static Snowflake snowflake = IdUtil.createSnowflake(DEFAULT_WORKER_ID, DEFAULT_LMSHOP_ID);

    /**
     * 生成雪花
     **/
    public static Long defaultSnowflakeId() {
        return snowflake.nextId();
    }
}

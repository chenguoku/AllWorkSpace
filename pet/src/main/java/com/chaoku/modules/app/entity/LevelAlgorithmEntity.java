package com.chaoku.modules.app.entity;

import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LevelAlgorithmEntity.java
 * @Description 计算等级算法的实体类
 * @createTime 2019年10月20日 14:58:00
 */
@Data
public class LevelAlgorithmEntity {

    /**
     * 当前经验
     */
    private Integer currentExperience;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 要加的经验
     */
    private Integer experience;

}

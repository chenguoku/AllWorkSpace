package com.chaoku.common.utils;

import com.chaoku.modules.app.entity.LevelAlgorithmEntity;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName CommonUtils.java
 * @Description 工具类
 * @createTime 2019年10月20日 15:30:00
 */
public class CommonUtils {


    /**
     * 涨经验的算法
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static LevelAlgorithmEntity getLevelAlgorithm(LevelAlgorithmEntity levelAlgorithmEntity) {

        Integer level = levelAlgorithmEntity.getLevel();
        Integer experience = levelAlgorithmEntity.getExperience();
        Integer currentExperience = levelAlgorithmEntity.getCurrentExperience();

        int experienceLimit = CommonUtils.getExperienceLimit(level);

        if (experienceLimit >= experience + currentExperience) {
            //不升级
            levelAlgorithmEntity.setCurrentExperience(experience + currentExperience);
            return levelAlgorithmEntity;
        } else {
            //升级
            levelAlgorithmEntity.setLevel(level + 1);
            levelAlgorithmEntity.setCurrentExperience(0);
            levelAlgorithmEntity.setExperience((experience + currentExperience) - experienceLimit);

            return getLevelAlgorithm(levelAlgorithmEntity);
        }

    }

    /**
     * 根据等级获取经验上线值
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static Integer getExperienceLimit(Integer level) {
        return 50 + (level - 1) * 100;
    }

    /**
     * 根据等级获取饥饿上线值
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static Integer getHungerLimit(Integer level) {
        return 100 + (level - 1) * 10;
    }

    /**
     * 根据等级获取清洁上线值
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static Integer getCleanLimit(Integer level) {
        return 100 + (level - 1) * 10;
    }

    /**
     * 根据等级获取心情上线值
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    public static Integer getMoodLimit(Integer level) {
        return 100 + (level - 1) * 10;
    }
}

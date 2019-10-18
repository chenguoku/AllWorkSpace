package com.chaoku.modules.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.*;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dto.pet.ActionEatDto;
import com.chaoku.modules.app.entity.PetEntity;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.entity.UserPetEntity;
import com.chaoku.modules.app.service.PetService;
import com.chaoku.modules.app.service.UserPetService;
import com.chaoku.modules.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("petService")
public class PetServiceImpl extends ServiceImpl<PetDao, PetEntity> implements PetService {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private UserService userService;

    @Autowired
    private UserPetService userPetService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PetEntity> page = this.page(
                new Query<PetEntity>().getPage(params),
                new QueryWrapper<PetEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 喂食的service
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/9
     */
    @Override
    public Result actionEat(ActionEatDto dto) {
        String userId = dto.getUserId();
        Integer props = dto.getProps();
        //1.判断用户是否有大于所加的食物
        UserEntity user = userService.getById(userId);
        if (props > user.getFoodBread()) {
            return new Result().error("食物不足");
        }

        UserPetEntity userPetEntity = userPetService.selectByUserId(user.getId());
        Integer hungerNumLimit = userPetEntity.getHungerNumLimit();
        Long hungerLimitExpire = RedisNumberParse.getHungerExpire(hungerNumLimit);
        Long propsExpire = RedisNumberParse.getHungerExpire(props);
        Long expireTime = 0L;
        Integer experience = 0;
        Integer moodNum = 0;

        //2.扣除食物
        //获取用户是否有食物
        Long expire = redisUtils.getExpire(RedisKeys.getHungerNum(userId));
        if (expire > 0) {
            //有食物
            if (hungerLimitExpire >= (expire + propsExpire)) {
                //饥饿上线时间 >= 已存在的时间+食物时间 ，取 已存在的时间+食物时间

            } else {
                //饥饿上线时间 < 已存在的时间+食物时间 ，取饥饿上线时间

            }

        } else {
            //没有食物
            if (hungerNumLimit >= props) {
                //饥饿上线时间 >= 食物时间 ,取食物时间
                expireTime = propsExpire;
                experience = props;
                moodNum = props;
            } else {
                // 饥饿上线时间 < 食物时间 ，取饥饿上线时间
                expireTime = hungerLimitExpire;
                experience = hungerNumLimit;
                moodNum = hungerNumLimit;
            }
        }


        //3.增加饥饿值

        //4.增加心情值

        //5.增加经验值

        return new Result();
    }

}
package com.chaoku.modules.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.*;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dao.UserPetDao;
import com.chaoku.modules.app.entity.UserPetEntity;
import com.chaoku.modules.app.service.UserPetService;
import com.chaoku.modules.app.vo.pet.PetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userPetService")
public class UserPetServiceImpl extends ServiceImpl<UserPetDao, UserPetEntity> implements UserPetService {

    @Autowired
    private PetDao petDao;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserPetEntity> page = this.page(
                new Query<UserPetEntity>().getPage(params),
                new QueryWrapper<UserPetEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public UserPetEntity selectByUserId(Long userId) {
        QueryWrapper<UserPetEntity> queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", userId);
        List<UserPetEntity> list = this.list(queryWrapper);
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }

    }

    @Override
    public PetVo getUserPetData(Long userId) {

        PetVo petVo = petDao.getPetVo(userId);

        Long hungerExpire = redisUtils.getExpire(RedisKeys.getHungerNum(String.valueOf(userId)));
        Long cleanExpire = redisUtils.getExpire(RedisKeys.getCleanNum(String.valueOf(userId)));
        Long moodExpire = redisUtils.getExpire(RedisKeys.getMoodNum(String.valueOf(userId)));

        if (hungerExpire > 0){
            petVo.setHungerNum(RedisNumberParse.parseHungerExpire(hungerExpire));
        }else {
            petVo.setHungerNum(0);
        }
        if (cleanExpire > 0){
            petVo.setCleanNum(RedisNumberParse.parseCleanExpire(cleanExpire));
        }else {
            petVo.setCleanNum(0);
        }
        if (moodExpire > 0){
            petVo.setMoodNum(RedisNumberParse.parseMoodExpire(moodExpire));
        }else {
            petVo.setMoodNum(0);
        }

        return petVo;
    }

}
package com.chaoku.modules.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.*;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dto.pet.ActionEatDto;
import com.chaoku.modules.app.dto.pet.ActionShowerDto;
import com.chaoku.modules.app.dto.pet.AdoptPetDto;
import com.chaoku.modules.app.entity.LevelAlgorithmEntity;
import com.chaoku.modules.app.entity.PetEntity;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.entity.UserPetEntity;
import com.chaoku.modules.app.service.PetService;
import com.chaoku.modules.app.service.UserPetService;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.vo.pet.PetTypeVo;
import com.chaoku.modules.app.vo.pet.PetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        Long propsExpire = RedisNumberParse.getHungerExpire(props);
        Long expire = redisUtils.getExpire(RedisKeys.getHungerNum(userId));
        //对所加食物做一个效验
        if ((propsExpire + expire) > RedisNumberParse.getHungerExpire(hungerNumLimit + 1)) {
            return new Result().error("食物添加过多，请重新选择");
        }

        //2.扣除食物
        user.setFoodBread(user.getFoodBread() - props);
        userService.updateById(user);

        //3.增加饥饿值
        Long hungerExpireTime = getHungerExpire(props, expire, hungerNumLimit);
        redisUtils.set(RedisKeys.getHungerNum(userId), 1, hungerExpireTime);

        //4.增加心情值
        Integer moodNumLimit = userPetEntity.getMoodNumLimit();
        Long moodExpireTime = getMoodExpire(props, moodNumLimit, redisUtils.getExpire(RedisKeys.getMoodNum(userId)));
        redisUtils.set(RedisKeys.getMoodNum(userId), 1, moodExpireTime);

        //5.增加经验值,并判断是否升级
        addExperience(props, userPetEntity);

        PetVo userPetData = userPetService.getUserPetData(Long.parseLong(userId));
        return new Result().ok(userPetData);
    }

    /**
     * 洗澡的service
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/30
     */
    @Override
    public Result actionEat(ActionShowerDto dto) {
        String userId = dto.getUserId();
        Integer props = dto.getProps();
        //1.判断用户是否有大于所加的食物
        UserEntity user = userService.getById(userId);
        if (props > user.getShowerSoap()) {
            return new Result().error("沐浴露数量不足");
        }

        UserPetEntity userPetEntity = userPetService.selectByUserId(user.getId());
        Integer cleanNumLimit = userPetEntity.getCleanNumLimit();
        Long propsExpire = RedisNumberParse.getCleanExpire(props);
        Long expire = redisUtils.getExpire(RedisKeys.getCleanNum(userId));
        //对所加食物做一个效验
        if ((propsExpire + expire) > RedisNumberParse.getCleanExpire(cleanNumLimit + 1)) {
            return new Result().error("沐浴露添加过多，请重新选择");
        }

        //2.扣除沐浴露
        user.setShowerSoap(user.getShowerSoap() - props);
        userService.updateById(user);

        //3.增加清洁值
        Long cleanExpireTime = getCleanExpire(props, expire, cleanNumLimit);
        redisUtils.set(RedisKeys.getCleanNum(userId), 1, cleanExpireTime);

        //4.增加心情值
        Integer moodNumLimit = userPetEntity.getMoodNumLimit();
        Long moodExpireTime = getMoodExpire(props, moodNumLimit, redisUtils.getExpire(RedisKeys.getMoodNum(userId)));
        redisUtils.set(RedisKeys.getMoodNum(userId), 1, moodExpireTime);

        //5.增加经验值,并判断是否升级
        addExperience(props, userPetEntity);

        PetVo userPetData = userPetService.getUserPetData(Long.parseLong(userId));
        return new Result().ok(userPetData);
    }

    /**
     * 获取宠物列表接口
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/30
     */
    @Override
    public Result listPet() {
        List<PetTypeVo> resultList = new ArrayList<>();
        List<PetEntity> list = this.list();

        for (PetEntity petEntity : list) {
            PetTypeVo petTypeVo = new PetTypeVo();
            petTypeVo.setId(petEntity.getId());
            petTypeVo.setName(petEntity.getName());
            petTypeVo.setType(petEntity.getType());
            petTypeVo.setPicture(petEntity.getPicture());

            resultList.add(petTypeVo);
        }

        return new Result().ok(resultList);
    }

    /**
     * 领养宠物
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/31
     */
    @Override
    public Result getadoptPet(AdoptPetDto dto) {
        PetEntity petEntity = this.getById(dto.getPetId());

        UserPetEntity userPetEntity = new UserPetEntity();
        userPetEntity.setId(IdGenerator.defaultSnowflakeId());
        userPetEntity.setNickname(dto.getPetNickName());
        userPetEntity.setLevel(1);
        userPetEntity.setExperience(0);
        userPetEntity.setExperienceNumLimit(CommonUtils.getExperienceLimit(1));
        userPetEntity.setHungerNumLimit(CommonUtils.getHungerLimit(1));
        userPetEntity.setCleanNumLimit(CommonUtils.getCleanLimit(1));
        userPetEntity.setMoodNumLimit(CommonUtils.getMoodLimit(1));

        userPetService.save(userPetEntity);

        Map map = new HashMap();
        map.put("status", true);
        return new Result().ok(map);
    }

    /**
     * 获取饥饿的过期时间
     *
     * @param foodNum        食物数量
     * @param expire         目前redis中的饥饿过期时间
     * @param hungerNumLimit 饥饿上线
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    private Long getHungerExpire(Integer foodNum, Long expire, Integer hungerNumLimit) {
        Long expireTime;
        Long propsExpire = RedisNumberParse.getHungerExpire(foodNum);
        Long hungerLimitExpire = RedisNumberParse.getHungerExpire(hungerNumLimit);
        //获取用户redis中是否有食物
        if (expire > 0) {
            //有食物
            if (hungerLimitExpire >= (expire + propsExpire)) {
                //饥饿上线时间 >= 已存在的时间+食物时间 ，取 已存在的时间+食物时间
                expireTime = expire + propsExpire;
            } else {
                //饥饿上线时间 < 已存在的时间+食物时间 ，取饥饿上线时间
                expireTime = hungerLimitExpire;
            }

        } else {
            //没有食物
            if (hungerNumLimit >= foodNum) {
                //饥饿上线时间 >= 食物时间 ,取食物时间
                expireTime = propsExpire;
            } else {
                // 饥饿上线时间 < 食物时间 ，取饥饿上线时间
                expireTime = hungerLimitExpire;
            }
        }

        return expireTime;
    }

    /**
     * 获取清洁值的过期时间
     *
     * @param soapNum       沐浴露数量
     * @param expire        目前redis中清洁值过期时间
     * @param cleanNumLimit 清洁值上限
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    private Long getCleanExpire(Integer soapNum, Long expire, Integer cleanNumLimit) {
        Long expireTime;
        Long propsExpire = RedisNumberParse.getCleanExpire(soapNum);
        Long cleanLimitExpire = RedisNumberParse.getCleanExpire(cleanNumLimit);
        //获取用户redis中是否有沐浴露
        if (expire > 0) {
            //有沐浴露
            if (cleanNumLimit >= (expire + propsExpire)) {
                //清洁值上线时间 >= 已存在的时间+沐浴露时间 ，取 已存在的时间+沐浴露时间
                expireTime = expire + propsExpire;
            } else {
                //清洁值上线时间 < 已存在的时间+食物时间 ，取清洁值上线时间
                expireTime = cleanLimitExpire;
            }

        } else {
            //没有沐浴露
            if (cleanNumLimit >= soapNum) {
                //清洁上线时间 >= 沐浴露时间 ,取沐浴露时间
                expireTime = propsExpire;
            } else {
                // 清洁值上线时间 < 沐浴露时间 ，取沐浴露上线时间
                expireTime = cleanLimitExpire;
            }
        }

        return expireTime;
    }

    /**
     * 获取心情值的过期时间
     *
     * @param moodNum      心情值
     * @param moodNumLimit 心情值上线
     * @param expire       redis中已存在心情值
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    private Long getMoodExpire(Integer moodNum, Integer moodNumLimit, Long expire) {
        Long expireTime;
        Long propsExpire = RedisNumberParse.getMoodExpire(moodNum);
        Long moodLimitExpire = RedisNumberParse.getMoodExpire(moodNumLimit);
        //获取用户redis中是否有心情
        if (expire > 0) {
            //有食物
            if (moodLimitExpire >= (expire + propsExpire)) {
                //心情上线时间 >= 已存在的时间+心情时间 ，取 已存在的时间+心情时间
                expireTime = expire + propsExpire;
            } else {
                //心情上线时间 < 已存在的时间+心情时间 ，取心情上线时间
                expireTime = moodLimitExpire;
            }

        } else {
            //没有心情
            if (moodNumLimit >= moodNum) {
                //心情上线时间 >= 心情时间 ,取心情时间
                expireTime = propsExpire;
            } else {
                //心情上线时间 < 心情时间 ，取心情上线时间
                expireTime = moodLimitExpire;
            }
        }

        return expireTime;
    }

    /**
     * 增加经验
     *
     * @param experience    经验
     * @param userPetEntity 用户宠物的实体类
     * @return:
     * @author: chenguoku
     * @date: 2019/10/20
     */
    private void addExperience(Integer experience, UserPetEntity userPetEntity) {

        if (userPetEntity.getExperienceNumLimit() >= (experience + userPetEntity.getExperience())) {
            //不升级
            userPetEntity.setExperience(userPetEntity.getExperience() + experience);

        } else {
            //升级
            //获取涨了几级 和 升完级 剩多少经验
            LevelAlgorithmEntity levelAlgorithmEntity = new LevelAlgorithmEntity();
            levelAlgorithmEntity.setLevel(userPetEntity.getLevel());
            levelAlgorithmEntity.setExperience(experience);
            levelAlgorithmEntity.setCurrentExperience(userPetEntity.getExperience());
            LevelAlgorithmEntity levelAlgorithm = CommonUtils.getLevelAlgorithm(levelAlgorithmEntity);

            userPetEntity.setLevel(levelAlgorithm.getLevel());
            userPetEntity.setExperience(levelAlgorithm.getCurrentExperience());

            Integer level = userPetEntity.getLevel();
            userPetEntity.setExperienceNumLimit(CommonUtils.getExperienceLimit(level));
            userPetEntity.setHungerNumLimit(CommonUtils.getHungerLimit(level));
            userPetEntity.setCleanNumLimit(CommonUtils.getCleanLimit(level));
            userPetEntity.setMoodNumLimit(CommonUtils.getMoodLimit(level));
        }

        userPetService.updateById(userPetEntity);
    }


}
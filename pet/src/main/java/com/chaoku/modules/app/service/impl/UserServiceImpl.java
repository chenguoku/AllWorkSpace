package com.chaoku.modules.app.service.impl;

import cn.hutool.core.lang.UUID;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.*;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dao.UserDao;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Value("${wechat.loginUrl}")
    private String wechatLoginUrl;

    @Value("${wechat.appid}")
    private String appId;

    @Value("${wechat.secret}")
    private String secret;

    @Value("${wechat.grant_type}")
    private String grantType;

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private PetDao petDao;

    private static final String GUEST = "guest";

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserEntity> page = this.page(
                new Query<UserEntity>().getPage(params),
                new QueryWrapper<UserEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public UserEntity selectByName(String username) {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", username);

        List<UserEntity> list = this.list(queryWrapper);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * 用户注册
     *
     * @param: userInfo
     * @return: com.chaoku.common.utils.Result
     * @author: chenguoku
     * @date: 2019/10/10
     */
    @Override
    public Result register(String userInfo) {
        UserEntity userEntity = new UserEntity();
        Long id = IdGenerator.defaultSnowflakeId();
        userEntity.setId(id);
        userEntity.setPetCurrency(0);
        userEntity.setDiamond(0);
        if (StringUtils.equals(GUEST, userInfo)) {
            // 游客
            userEntity.setNickName(UUID.fastUUID().toString().split("-")[0]);

        } else {
            //授权用户
            Map map = JSON.parseObject(userInfo, Map.class);
            if (map.get("nickName") != null) {
                userEntity.setNickName(String.valueOf(map.get("nickName")));
            }
            if (map.get("gender") != null) {
                userEntity.setGender(Integer.parseInt(String.valueOf(map.get("gender"))));
            }
            if (map.get("language") != null) {
                userEntity.setLanguage(String.valueOf(map.get("language")));
            }
            if (map.get("city") != null) {
                userEntity.setCity(String.valueOf(map.get("city")));
            }
            if (map.get("province") != null) {
                userEntity.setProvince(String.valueOf(map.get("province")));
            }
            if (map.get("country") != null) {
                userEntity.setCountry(String.valueOf(map.get("country")));
            }
            if (map.get("avatarUrl") != null) {
                userEntity.setAvatarUrl(String.valueOf(map.get("avatarUrl")));
            }
            if (map.get("unionId") != null) {
                userEntity.setUnionId(String.valueOf(map.get("unionId")));
            }
            if (map.get("watermark") != null) {
                Map watermark = (Map) map.get("watermark");
                if (watermark.get("timestamp") != null) {
                    userEntity.setTimestamp(Long.parseLong(String.valueOf(watermark.get("timestamp"))));
                }
                if (watermark.get("appid") != null) {
                    userEntity.setAppid(String.valueOf(watermark.get("appid")));
                }
            }
        }

        boolean save = this.save(userEntity);
        return new Result().ok(save);
    }

}
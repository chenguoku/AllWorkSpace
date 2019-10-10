package com.chaoku.modules.app.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.*;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dao.UserDao;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.dto.user.LoginForm;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.vo.pet.PetVo;
import com.chaoku.modules.app.vo.user.LoginVo;
import com.chaoku.modules.app.vo.user.TokenMappingVo;
import com.chaoku.modules.app.vo.user.UserVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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

        if (StringUtils.equals(GUEST, userInfo)) {
            // 游客
            UserEntity userEntity = new UserEntity();
            boolean save = this.save(userEntity);

        } else {
            //授权用户
            Map map = JSON.parseObject(userInfo, Map.class);
        }

        return null;
    }
}
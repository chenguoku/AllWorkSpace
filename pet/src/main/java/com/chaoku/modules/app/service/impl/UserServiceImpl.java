package com.chaoku.modules.app.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.*;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dao.UserDao;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.form.LoginForm;
import com.chaoku.modules.app.service.PetService;
import com.chaoku.modules.app.service.UserPetService;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.vo.pet.PetVo;
import com.chaoku.modules.app.vo.user.LoginVo;
import com.chaoku.modules.app.vo.user.TokenMappingVo;
import com.chaoku.modules.app.vo.user.UserVo;
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
    private JwtUtils jwtUtils;

    @Autowired
    private PetDao petDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserEntity> page = this.page(
                new Query<UserEntity>().getPage(params),
                new QueryWrapper<UserEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 小程序微信验证
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/9/13
     */
    @Override
    public Result<LoginVo> wechatLogin(LoginForm form) {
        LoginVo loginVo = new LoginVo();
        TokenMappingVo tokenMappingVo = new TokenMappingVo();

        //请求微信登录链接
        Map<String, String> map = new HashMap<>();
        map.put("appid", appId);
        map.put("secret", secret);
        map.put("js_code", form.getCode());
        map.put("grant_type", grantType);
        String s = HttpClientTool.doGet(wechatLoginUrl, map);
        Map loginResultMap = JSON.parseObject(s, Map.class);

        if (loginResultMap.get("session_key") == null) {
            return new Result<LoginVo>().error("登录失败");
        }

        tokenMappingVo.setSessionKey(String.valueOf(loginResultMap.get("session_key")));
        tokenMappingVo.setOpenId(String.valueOf(loginResultMap.get("openid")));

        //判断userId是否为空
        if (form.getUserId() != null) {
            UserEntity userEntity = userService.getById(form.getUserId());
            UserVo userVo = ConvertUtils.sourceToTarget(userEntity, UserVo.class);
            loginVo.setUserVo(userVo);
            tokenMappingVo.setUserVo(userVo);

            if (userEntity != null) {
                PetVo petVo = petDao.getPetVo(userEntity.getId());
                loginVo.setPetVo(petVo);
                tokenMappingVo.setPetVo(petVo);
            }
        }

        //生成token
        String token = getRandomToken();
        loginVo.setToken(token);
        redisUtils.set(token, tokenMappingVo);

        return new Result<LoginVo>().ok(loginVo);
    }

    @Override
    public UserEntity selectByName(String username) {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",username);

        List<UserEntity> list = this.list(queryWrapper);
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    private String getRandomToken() {
        String token = jwtUtils.generateToken(IdGenerator.defaultSnowflakeId());
        return token;
    }

}
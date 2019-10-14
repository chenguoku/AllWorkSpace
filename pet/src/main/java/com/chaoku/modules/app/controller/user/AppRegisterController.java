/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.chaoku.modules.app.controller.user;


import com.alibaba.fastjson.JSON;
import com.chaoku.common.utils.RedisUtils;
import com.chaoku.common.utils.Result;
import com.chaoku.common.utils.WechatUtils;
import com.chaoku.common.validator.ValidatorUtils;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dto.user.RegisterForm;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.service.impl.UserServiceImpl;
import com.chaoku.modules.app.vo.pet.PetVo;
import com.chaoku.modules.app.vo.user.RegisterVo;
import com.chaoku.modules.app.vo.user.TokenMappingVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 注册
 *
 * @author chenguoku chenguoku@cgkhh1996@163.com
 */
@RestController
@RequestMapping("/user")
@Api(value = "AppRegisterController", tags = "注册接口")
public class AppRegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private PetDao petDao;

    @PostMapping("register")
    @ApiOperation("注册")
    public Result register(@RequestBody RegisterForm form, HttpServletRequest request) {

        ValidatorUtils.validateEntity(form);

        String token = request.getHeader("token");
        String redisString = String.valueOf(redisUtils.hGetAll(token));
        TokenMappingVo tokenMappingVo = JSON.parseObject(redisString, TokenMappingVo.class);
        String sessionKey = tokenMappingVo.getSessionKey();

        String userInfo = UserServiceImpl.GUEST;

        if (!form.getUserInfo().equals(UserServiceImpl.GUEST)) {
            Map map = JSON.parseObject(form.getUserInfo(), Map.class);
            String iv = String.valueOf(map.get("iv"));
            String encryptedData = String.valueOf(map.get("encryptedData"));

            userInfo = WechatUtils.getUserInfo(encryptedData, sessionKey, iv);
        }

        Result registerResult = userService.register(userInfo);

        RegisterVo registerVo = new RegisterVo();
        if (registerResult.getCode() == 200) {
            registerVo.setStatus(true);
            UserEntity userEntity = (UserEntity) registerResult.getData();
            PetVo petVo = petDao.getPetVo(userEntity.getId());
            registerVo.setGameData(petVo);

            registerResult.setData(registerVo);
            return registerResult;
        } else {
            registerVo.setStatus(false);
            registerVo.setGameData(null);

            registerResult.setData(registerVo);
            return registerResult;
        }

    }
}

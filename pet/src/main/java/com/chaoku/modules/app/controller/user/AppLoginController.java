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
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dto.user.LoginForm;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.vo.pet.PetVo;
import com.chaoku.modules.app.vo.user.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * APP登录授权
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/user")
@Api(value = "AppLoginController", tags = "APP登录接口")
public class AppLoginController {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private PetDao petDao;

    /**
     * 登录
     */
    @PostMapping("login")
    @ApiOperation("登录")
    public Result login(LoginForm form) {
        return new Result();
    }

    /**
     * 检查登陆是否过期
     *
     * @return: com.chaoku.common.utils.Result
     * @author: chenguoku
     * @date: 2019/10/1
     */
    @GetMapping(value = "login/check")
    @ApiOperation("检查登录是否过期")
    public Result checkLogin() {

        Map map = new HashMap(2);
        map.put("status",true);
        return new Result().ok(map, "success");
    }

    /**
     * 获取游戏数据
     *
     * @param: request
     * @return: com.chaoku.common.utils.Result
     * @author: chenguoku
     * @date: 2019/10/1
     */
    @GetMapping("game/data")
    @ApiOperation("获取游戏数据")
    public Result getGameData(HttpServletRequest request) {
        String token = request.getHeader("token");
        String userString = String.valueOf(redisUtils.hGet(token, "userVo"));
        UserVo userVo = JSON.parseObject(userString, UserVo.class);

        PetVo petVo = petDao.getPetVo(userVo.getId());

        return new Result().ok(petVo);
    }

}

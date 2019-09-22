/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.chaoku.modules.app.controller;


import com.chaoku.common.utils.JwtUtils;
import com.chaoku.common.utils.Result;
import com.chaoku.common.validator.ValidatorUtils;
import com.chaoku.modules.app.form.LoginForm;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.vo.user.LoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * APP登录授权
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/user")
@Api(value = "AppLoginController",tags = "APP登录接口")
public class AppLoginController {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    @ApiOperation("测试")
    public void test(){
        System.out.println(111);
    }

    /**
     * 登录
     */
    @PostMapping("login")
    @ApiOperation("登录")
    public Result login(LoginForm form) {
        //表单校验
        ValidatorUtils.validateEntity(form);

        //用户登录
        Result result = userService.wechatLogin(form);
        if (result.getCode() == 500) {
            return result;
        }

        LoginVo loginVo = (LoginVo) result.getData();


        result.setData(loginVo);

        return result;
    }

}

/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.chaoku.modules.app.controller.user;


import com.chaoku.common.utils.Result;
import com.chaoku.common.validator.ValidatorUtils;
import com.chaoku.modules.app.dto.user.RegisterForm;
import com.chaoku.modules.app.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("register")
    @ApiOperation("注册")
    public Result register(@RequestBody RegisterForm form) {

        ValidatorUtils.validateEntity(form);


        return new Result();
    }
}

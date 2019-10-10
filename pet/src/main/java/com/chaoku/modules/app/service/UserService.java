package com.chaoku.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Result;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.dto.user.LoginForm;

import java.util.Map;

/**
 * 用户表
 *
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-09-08 22:14:27
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 根据用户名查询用户信息
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/9/18
     */
    UserEntity selectByName(String username);

    /**
     * 用户注册
     *
     * @param: userInfo
     * @return: com.chaoku.common.utils.Result
     * @author: chenguoku
     * @date: 2019/10/10
     */
    Result register(String userInfo);

}


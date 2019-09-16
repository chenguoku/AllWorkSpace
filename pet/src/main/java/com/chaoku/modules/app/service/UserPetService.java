package com.chaoku.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.modules.app.entity.UserPetEntity;

import java.util.Map;

/**
 * 用户宠物表
 *
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-09-08 22:14:27
 */
public interface UserPetService extends IService<UserPetEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.chaoku.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.modules.app.entity.UserPetEntity;
import com.chaoku.modules.app.vo.pet.PetVo;

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

    UserPetEntity selectByUserId(Long userId);

    PetVo getUserPetData(Long userId);
}


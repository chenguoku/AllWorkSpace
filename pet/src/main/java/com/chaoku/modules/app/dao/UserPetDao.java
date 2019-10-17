package com.chaoku.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chaoku.modules.app.entity.UserPetEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户宠物表
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-10-17 23:42:17
 */
@Mapper
public interface UserPetDao extends BaseMapper<UserPetEntity> {
	
}

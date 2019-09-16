package com.chaoku.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chaoku.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-09-08 22:14:27
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}

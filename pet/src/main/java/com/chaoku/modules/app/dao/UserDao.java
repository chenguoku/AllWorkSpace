package com.chaoku.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chaoku.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-10-10 20:42:14
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}

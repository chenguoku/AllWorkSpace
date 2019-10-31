package com.chaoku.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chaoku.modules.app.entity.QuestionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 问题表
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-11-01 00:18:47
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}

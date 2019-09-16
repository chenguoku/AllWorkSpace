package com.chaoku.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chaoku.modules.app.entity.PetEntity;
import com.chaoku.modules.app.vo.pet.PetVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 宠物表 
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-09-08 22:14:27
 */
@Mapper
public interface PetDao extends BaseMapper<PetEntity> {

    PetVo getPetVo(Long userId);
	
}

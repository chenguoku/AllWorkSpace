package com.chaoku.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Result;
import com.chaoku.modules.app.dto.pet.ActionEatDto;
import com.chaoku.modules.app.entity.PetEntity;
import com.chaoku.modules.app.vo.pet.PetVo;

import java.util.Map;

/**
 * 宠物表 
 *
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-09-08 22:14:27
 */
public interface PetService extends IService<PetEntity> {

    PageUtils queryPage(Map<String, Object> params);

    Result actionEat(ActionEatDto dto);

}


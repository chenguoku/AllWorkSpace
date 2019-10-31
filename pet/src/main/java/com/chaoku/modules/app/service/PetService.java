package com.chaoku.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Result;
import com.chaoku.modules.app.dto.pet.ActionEatDto;
import com.chaoku.modules.app.dto.pet.ActionShowerDto;
import com.chaoku.modules.app.dto.pet.AdoptPetDto;
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

    /**
     * 喂食的service
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/17
     */
    Result actionEat(ActionEatDto dto);

    /**
     * 洗澡的service
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/30
     */
    Result actionEat(ActionShowerDto dto);

    /**
     * 获取宠物列表接口
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/30
     */
    Result listPet();

    /**
     * 领养宠物
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/31
     */
    Result getadoptPet(AdoptPetDto dto);

}


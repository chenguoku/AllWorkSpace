package com.chaoku.modules.app.service.impl;

import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.entity.PetEntity;
import com.chaoku.modules.app.service.PetService;
import com.chaoku.modules.app.vo.pet.PetVo;
import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Query;


@Service("petService")
public class PetServiceImpl extends ServiceImpl<PetDao, PetEntity> implements PetService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PetEntity> page = this.page(
                new Query<PetEntity>().getPage(params),
                new QueryWrapper<PetEntity>()
        );

        return new PageUtils(page);
    }

}
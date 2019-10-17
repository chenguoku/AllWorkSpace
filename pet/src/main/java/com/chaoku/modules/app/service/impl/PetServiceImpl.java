package com.chaoku.modules.app.service.impl;

import com.chaoku.common.utils.RedisUtils;
import com.chaoku.common.utils.Result;
import com.chaoku.modules.app.dao.PetDao;
import com.chaoku.modules.app.dto.pet.ActionEatDto;
import com.chaoku.modules.app.entity.PetEntity;
import com.chaoku.modules.app.service.PetService;
import com.chaoku.modules.app.vo.pet.PetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Query;


@Service("petService")
public class PetServiceImpl extends ServiceImpl<PetDao, PetEntity> implements PetService {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PetEntity> page = this.page(
                new Query<PetEntity>().getPage(params),
                new QueryWrapper<PetEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 喂食的service
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/9
     */
    @Override
    public Result actionEat(ActionEatDto dto) {

        //1.判断用户是否有大于所加的食物

        //2.扣除食物

        //3.增加饥饿值

        //4.增加心情值

        //5.增加经验值

        return new Result();
    }

}
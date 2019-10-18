package com.chaoku.modules.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Query;
import com.chaoku.modules.app.dao.UserPetDao;
import com.chaoku.modules.app.entity.UserPetEntity;
import com.chaoku.modules.app.service.UserPetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userPetService")
public class UserPetServiceImpl extends ServiceImpl<UserPetDao, UserPetEntity> implements UserPetService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserPetEntity> page = this.page(
                new Query<UserPetEntity>().getPage(params),
                new QueryWrapper<UserPetEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public UserPetEntity selectByUserId(Long userId) {
        QueryWrapper<UserPetEntity> queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", userId);
        List<UserPetEntity> list = this.list(queryWrapper);
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }

    }

}
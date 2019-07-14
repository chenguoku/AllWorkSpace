package io.renren.modules.garbage.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.garbage.dao.LajiInfoDao;
import io.renren.modules.garbage.entity.LajiInfoEntity;
import io.renren.modules.garbage.service.LajiInfoService;


@Service("lajiInfoService")
public class LajiInfoServiceImpl extends ServiceImpl<LajiInfoDao, LajiInfoEntity> implements LajiInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LajiInfoEntity> page = this.page(
                new Query<LajiInfoEntity>().getPage(params),
                new QueryWrapper<LajiInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<LajiInfoEntity> queryGarbageInfo(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }

        IPage<LajiInfoEntity> page = this.page(new Page<>(1, 8), new QueryWrapper<LajiInfoEntity>().like("name", name)
                .orderByDesc("count"));

        return page.getRecords();
    }

    @Override
    public void updateInfoCount(LajiInfoEntity lajiInfoEntity) {
        lajiInfoEntity.setCount(lajiInfoEntity.getCount()+1);
        baseMapper.updateById(lajiInfoEntity);
    }

}
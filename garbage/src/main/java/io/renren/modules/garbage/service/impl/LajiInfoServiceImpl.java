package io.renren.modules.garbage.service.impl;

import org.springframework.stereotype.Service;
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

}
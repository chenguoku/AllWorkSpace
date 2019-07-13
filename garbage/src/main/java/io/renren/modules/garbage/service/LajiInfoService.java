package io.renren.modules.garbage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.garbage.entity.LajiInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author cgk
 * @email cgkhh1996@163.com
 * @date 2019-07-13 16:01:21
 */
public interface LajiInfoService extends IService<LajiInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


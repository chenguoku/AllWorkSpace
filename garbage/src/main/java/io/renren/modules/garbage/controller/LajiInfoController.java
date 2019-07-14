package io.renren.modules.garbage.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.renren.modules.garbage.dao.LajiInfoDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.garbage.entity.LajiInfoEntity;
import io.renren.modules.garbage.service.LajiInfoService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author cgk
 * @email cgkhh1996@163.com
 * @date 2019-07-13 16:01:21
 */
@RestController
@RequestMapping("/garbage")
public class LajiInfoController {
    @Autowired
    private LajiInfoService lajiInfoService;

    /**
     * 列表
     */
    @RequestMapping("/lajiinfo/{name}")
    public R list(@PathVariable(value = "name") String name){
        List<LajiInfoEntity> lajiInfoEntities = lajiInfoService.queryGarbageInfo(name);

        return R.ok().put("list", lajiInfoEntities);
    }

    @PostMapping("/lajiinfo")
    public R updateInfoCount(LajiInfoEntity lajiInfoEntity){
        lajiInfoService.updateInfoCount(lajiInfoEntity);
        return R.ok();
    }

}

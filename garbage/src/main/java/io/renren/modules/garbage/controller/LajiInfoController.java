package io.renren.modules.garbage.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("garbage/lajiinfo")
@Api("垃圾分类")
public class LajiInfoController {
    @Autowired
    private LajiInfoService lajiInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("查询")
//    @RequiresPermissions("garbage:lajiinfo:list")
    public R list(){
//        PageUtils page = lajiInfoService.queryPage(params);

        System.out.println("1");
        return R.ok().put("page", "!");
    }


//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("garbage:lajiinfo:info")
//    public R info(@PathVariable("id") Long id){
//		LajiInfoEntity lajiInfo = lajiInfoService.getById(id);
//
//        return R.ok().put("lajiInfo", lajiInfo);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("garbage:lajiinfo:save")
//    public R save(@RequestBody LajiInfoEntity lajiInfo){
//		lajiInfoService.save(lajiInfo);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("garbage:lajiinfo:update")
//    public R update(@RequestBody LajiInfoEntity lajiInfo){
//		lajiInfoService.updateById(lajiInfo);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("garbage:lajiinfo:delete")
//    public R delete(@RequestBody Long[] ids){
//		lajiInfoService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}

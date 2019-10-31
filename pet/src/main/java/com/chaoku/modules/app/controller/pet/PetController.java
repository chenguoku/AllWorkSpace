package com.chaoku.modules.app.controller.pet;

import com.chaoku.common.utils.Result;
import com.chaoku.common.validator.ValidatorUtils;
import com.chaoku.modules.app.dto.pet.ActionEatDto;
import com.chaoku.modules.app.dto.pet.ActionShowerDto;
import com.chaoku.modules.app.dto.pet.AdoptPetDto;
import com.chaoku.modules.app.service.PetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName PetController.java
 * @Description 宠物Controller
 * @createTime 2019年10月01日
 */
@RestController
@RequestMapping("/pet")
@Api(value = "PetController", tags = "宠物")
public class PetController {

    @Autowired
    private PetService petService;

    /**
     * 喂食
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/9
     */
    @PostMapping("action/eat")
    @ApiOperation("喂食")
    public Result actionEat(@RequestBody ActionEatDto dto) {
        ValidatorUtils.validateEntity(dto);

        Result result = petService.actionEat(dto);

        return result;
    }

    /**
     * 洗澡
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/30
     */
    @PostMapping("action/shower")
    @ApiOperation("洗澡")
    public Result actionShower(@RequestBody ActionShowerDto dto) {
        ValidatorUtils.validateEntity(dto);

        Result result = petService.actionEat(dto);

        return result;
    }

    /**
     * 获取宠物列表接口
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/30
     */
    @GetMapping("list")
    @ApiOperation("获取宠物列表接口")
    public Result listPet() {
        Result result = petService.listPet();
        return result;
    }

    /**
     * 领养宠物
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/10/31
     */
    @PostMapping("adopt")
    @ApiOperation("领养宠物")
    public Result getadoptPet(@RequestBody AdoptPetDto dto) {
        Result result = petService.getadoptPet(dto);
        return result;
    }

}

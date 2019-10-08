package com.chaoku.modules.app.controller;

import com.chaoku.common.utils.Result;
import com.chaoku.common.validator.ValidatorUtils;
import com.chaoku.modules.app.dto.pet.ActionEatDto;
import com.chaoku.modules.app.service.PetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result actionEat(@RequestBody ActionEatDto dto){
        ValidatorUtils.validateEntity(dto);

        Result result = petService.actionEat(dto);

        return result;
    }

}

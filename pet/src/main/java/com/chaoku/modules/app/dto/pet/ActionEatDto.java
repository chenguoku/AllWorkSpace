package com.chaoku.modules.app.dto.pet;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName ActionEatDto.java
 * @Description 喂食的Dto
 * @createTime 2019年10月09日 00:16:00
 */
@ApiModel("喂食的Dto")
@Data
public class ActionEatDto {

    @ApiModelProperty("用户id")
    @NotBlank(message = "用户id不能为空")
    private String userId;

    @ApiModelProperty("喂食的粮食数")
    private Integer props;

}

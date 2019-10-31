package com.chaoku.modules.app.dto.pet;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName AdoptPetDto.java
 * @Description 领养宠物的Dto
 * @createTime 2019年10月31日 00:07:00
 */
@Data
@ApiModel("领养宠物的Dto")
public class AdoptPetDto {

    @ApiModelProperty("宠物id")
    private Long petId;

    @ApiModelProperty("宠物昵称")
    private String petNickName;

}

package com.chaoku.modules.app.vo.pet;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName PetTypeVo.java
 * @Description 宠物类别Vo
 * @createTime 2019年10月30日 23:53:00
 */
@Data
@ApiModel("宠物类别Vo")
public class PetTypeVo {

    @ApiModelProperty("宠物id")
    private Long id;

    @ApiModelProperty("宠物名")
    private String name;

    @ApiModelProperty("宠物类别")
    private String type;

    @ApiModelProperty("宠物图片")
    private String picture;

}

package com.chaoku.modules.app.vo.user;

import com.chaoku.modules.app.vo.pet.PetVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName RegisterVo.java
 * @Description 注册Vo
 * @createTime 2019年10月14日 23:40:00
 */
@Data
@ApiModel("注册的Vo")
public class RegisterVo {

    @ApiModelProperty("注册是否成功")
    private Boolean status;

    @ApiModelProperty("游戏的数据")
    private Long userId;

}

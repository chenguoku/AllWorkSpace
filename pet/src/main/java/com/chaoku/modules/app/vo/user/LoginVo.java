package com.chaoku.modules.app.vo.user;

import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.entity.UserPetEntity;
import com.chaoku.modules.app.vo.pet.PetVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LoginVo.java
 * @Description 登录返回值
 * @createTime 2019年09月14日 15:11:00
 */
@Data
@ApiModel("登录返回值")
public class LoginVo {

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "宠物数据")
    private PetVo petVo;

    @ApiModelProperty(value = "用户信息")
    private UserVo userVo;

}

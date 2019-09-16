package com.chaoku.modules.app.vo.user;

import com.chaoku.modules.app.vo.pet.PetVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName TokenMappingVo.java
 * @Description token 对应的实体类
 * @createTime 2019年09月14日 23:02:00
 */
@Data
@ApiModel("token 对应的实体类")
public class TokenMappingVo {

    @ApiModelProperty("微信登录成功后的 sessionKey")
    private String sessionKey;

    @ApiModelProperty("微信登录成功后的 openId")
    private String openId;

    @ApiModelProperty("用户信息")
    private UserVo userVo;

    @ApiModelProperty("宠物游戏数据")
    private PetVo petVo;

}

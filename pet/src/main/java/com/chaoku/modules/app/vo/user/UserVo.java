package com.chaoku.modules.app.vo.user;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName UserVo.java
 * @Description 用户信息
 * @createTime 2019年09月14日 15:23:00
 */
@Data
@ApiModel("用户信息")
public class UserVo {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Long id;
    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String username;
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String mobile;
    /**
     * 宠物币
     */
    @ApiModelProperty(value = "宠物币")
    private Integer petCurrency;
    /**
     * 钻石
     */
    @ApiModelProperty(value = "钻石")
    private Integer diamond;

}

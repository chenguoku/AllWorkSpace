package com.chaoku.modules.app.vo.pet;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName PetVo.java
 * @Description 宠物数据
 * @createTime 2019年09月14日 15:14:00
 */
@Data
@ApiModel("宠物数据")
public class PetVo {

    /**
     * 用户宠物表id
     */
    @ApiModelProperty("用户宠物表id")
    private Long id;
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;
    /**
     * 宠物id
     */
    @ApiModelProperty(value = "宠物id")
    private Long petId;
    /**
     * 宠物昵称
     */
    @ApiModelProperty(value = "宠物昵称")
    private String nickname;
    /**
     * 等级值
     */
    @ApiModelProperty(value = "等级值")
    private Integer level;
    /**
     * 经验值
     */
    @ApiModelProperty(value = "经验值")
    private Integer experience;
    /**
     * 类别
     */
    @ApiModelProperty(value = "类别")
    private String type;
    /**
     * 宠物名
     */
    @ApiModelProperty(value = "宠物名")
    private String name;
    /**
     * 坐着动作
     */
    @ApiModelProperty(value = "坐着动作")
    private String action1;
    /**
     * 行走动作
     */
    @ApiModelProperty(value = "行走动作")
    private String action2;
    /**
     * 灰头土脸动作坐着
     */
    @ApiModelProperty(value = "灰头土脸动作坐着")
    private String action3;
    /**
     * 灰头土脸动作行走
     */
    @ApiModelProperty(value = "灰头土脸动作行走")
    private String action4;
    /**
     * 洗澡动作
     */
    @ApiModelProperty(value = "洗澡动作")
    private String action5;
    /**
     * 开心动作
     */
    @ApiModelProperty(value = "开心动作")
    private String action6;
    /**
     * 难过动作
     */
    @ApiModelProperty(value = "难过动作")
    private String action7;

}

package com.chaoku.modules.app.dto.question;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName QuestionDto.java
 * @Description 确认问题Dto
 * @createTime 2019年11月11日 11:35:00
 */
@Data
@ApiModel("确认问题Dto")
public class QuestionConfirmDto {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户是否回答正确")
    private Boolean right;

}

package com.chaoku.modules.app.dto.question;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName QuestionDto.java
 * @Description 问题Dto
 * @createTime 2019年11月01日 00:35:00
 */
@Data
@ApiModel("问题Dto")
public class QuestionDto {

    @ApiModelProperty("用户id")
    private Long userId;

}

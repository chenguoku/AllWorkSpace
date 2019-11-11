package com.chaoku.modules.app.vo.question;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName QuestionVo.java
 * @Description 问题的Vo
 * @createTime 2019年11月11日
 */
@Data
@ApiModel("问题的Vo")
public class QuestionVo {

    /**
     * 问题的id
     */
    @ApiModelProperty("问题的id")
    private Long id;
    /**
     * 题目
     */
    @ApiModelProperty("题目")
    private String title;
    /**
     * A选项
     */
    @ApiModelProperty("A选项")
    private String optionA;
    /**
     * B选项
     */
    @ApiModelProperty("B选项")
    private String optionB;
    /**
     * C选项
     */
    @ApiModelProperty("C选项")
    private String optionC;
    /**
     * D选项
     */
    @ApiModelProperty("D选项")
    private String optionD;
    /**
     * 答案
     */
    @ApiModelProperty("答案")
    private String answer;

}
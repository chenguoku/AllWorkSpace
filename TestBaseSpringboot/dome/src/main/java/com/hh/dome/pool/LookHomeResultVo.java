package com.hh.dome.pool;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LookHomeResultVo.java
 * @Description 首页推荐搭配的结果
 * @createTime 2019年08月17日
 */
@Data
@ApiModel(value = "首页推荐搭配的结果")
public class LookHomeResultVo implements Serializable {

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    private Integer pageNo;

    /**
     * 一页显示多少
     */
    @ApiModelProperty(value = "一页显示多少")
    private Integer pageSize;

    /**
     * 总页数
     */
    @ApiModelProperty(value = "总页数")
    private Long total;

}

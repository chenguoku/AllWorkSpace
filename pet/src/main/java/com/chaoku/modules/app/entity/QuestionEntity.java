package com.chaoku.modules.app.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 问题表
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-11-01 00:18:47
 */
@Data
@TableName("tb_question")
public class QuestionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 题目
	 */
	private String title;
	/**
	 * A选项
	 */
	private String optionA;
	/**
	 * B选项
	 */
	private String optionB;
	/**
	 * C选项
	 */
	private String optionC;
	/**
	 * D选项
	 */
	private String optionD;
	/**
	 * 答案
	 */
	private String answer;
	/**
	 * 乐观锁
	 */
	private Long version;
	/**
	 * 创建人
	 */
	private String creator;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改人
	 */
	private String updater;
	/**
	 * 修改时间
	 */
	private Date updateDate;
	/**
	 * 删除标记
	 */
	private Integer delFlag;

}

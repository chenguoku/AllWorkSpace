package com.chaoku.modules.app.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 宠物表 
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-09-08 22:14:27
 */
@Data
@TableName("tb_pet")
public class PetEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 类别
	 */
	private String type;
	/**
	 * 宠物名
	 */
	private String name;
	/**
	 * 宠物图片
	 */
	private String picture;
	/**
	 * 坐着动作
	 */
	private String action1;
	/**
	 * 行走动作
	 */
	private String action2;
	/**
	 * 灰头土脸动作坐着
	 */
	private String action3;
	/**
	 * 灰头土脸动作行走
	 */
	private String action4;
	/**
	 * 洗澡动作
	 */
	private String action5;
	/**
	 * 开心动作
	 */
	private String action6;
	/**
	 * 难过动作
	 */
	private String action7;
	/**
	 * 预留动作
	 */
	private String action8;
	/**
	 * 预留动作
	 */
	private String action9;
	/**
	 * 预留动作
	 */
	private String action10;
	/**
	 * 预留动作
	 */
	private String action11;
	/**
	 * 预留动作
	 */
	private String action12;
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
	 * 更新人
	 */
	private String updater;
	/**
	 * 更新时间
	 */
	private Date updateDate;
	/**
	 * 删除标记
	 */
	private Integer delFlag;

}

package com.chaoku.modules.app.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户宠物表
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-09-08 22:14:27
 */
@Data
@TableName("tb_user_pet")
public class UserPetEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户宠物表id
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 宠物id
	 */
	private Long petId;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 等级值
	 */
	private Integer level;
	/**
	 * 经验值
	 */
	private Integer experience;
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

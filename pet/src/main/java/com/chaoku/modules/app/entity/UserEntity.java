package com.chaoku.modules.app.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * 
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-10-18 00:00:02
 */
@Data
@TableName("tb_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId
	private Long id;
	/**
	 * 用户姓名
	 */
	private String username;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 宠物币
	 */
	private Integer petCurrency;
	/**
	 * 钻石
	 */
	private Integer diamond;
	/**
	 * 食物面包
	 */
	private Integer foodBread;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 语言
	 */
	private String language;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 省会
	 */
	private String province;
	/**
	 * 国家
	 */
	private String country;
	/**
	 * 头像
	 */
	private String avatarUrl;
	/**
	 * 微信唯一Id
	 */
	private String unionId;
	/**
	 * 微信水印(watermark) 时间戳
	 */
	private Long timestamp;
	/**
	 * 微信水印(watermark) appId
	 */
	private String appid;
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

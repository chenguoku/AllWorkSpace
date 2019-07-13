package io.renren.modules.garbage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author cgk
 * @email cgkhh1996@163.com
 * @date 2019-07-13 16:01:21
 */
@Data
@TableName("laji_info")
public class LajiInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 垃圾名称
	 */
	private String name;
	/**
	 * 所属垃圾类型1.干垃圾2.湿垃圾3.可回收4.有害垃圾
	 */
	private Integer type;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Integer count;

}

package com.example.demo.entity;

import java.util.Date;

import javax.validation.constraints.*;

public class TestBean {

	@NotNull(message = "id不能为空")
	@Min(value = 1, message = "最小值为1")
	@Max(value = 10, message = "最大值为10")
	private Integer id;

	@NotNull(message = "姓名不能为空")
	@Size(min = 2, max = 4, message = "姓名长度必须在{min}和{max}之间")
	@Pattern(regexp = "[\u4e00-\u9fa5]", message = "名称只能是中文")
	private String username;

	@NotNull(message = "密码不能为空")
	@Size(min = 6, max = 12, message = "密码长度必须在{min}和{max}之间")
	private String password;

	@NotNull(message = "日期不能为空")
	@Past(message = "日期只能使用过去的时间")
	private Date birthday;

	@NotNull(message = "邮件不能为空")
	@Email(message = "邮件格式不对")
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}

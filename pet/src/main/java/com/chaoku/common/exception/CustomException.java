/**
 *
 *
 * https://www.leimingtech.com
 *
 * 版权所有，侵权必究！
 */

package com.chaoku.common.exception;


import com.chaoku.common.utils.MessageUtils;

/**
 * 自定义异常
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    private int code;
	private String msg;

	public CustomException(int code) {
		this.code = code;
		this.msg = MessageUtils.getMessage(code);
	}

	public CustomException(int code, String... params) {
		this.code = code;
		this.msg = MessageUtils.getMessage(code, params);
	}

	public CustomException(int code, Throwable e) {
		super(e);
		this.code = code;
		this.msg = MessageUtils.getMessage(code);
	}

	public CustomException(int code, Throwable e, String... params) {
		super(e);
		this.code = code;
		this.msg = MessageUtils.getMessage(code, params);
	}

	public CustomException(String msg) {
		super(msg);
		this.code = ErrorCode.INTERNAL_SERVER_ERROR;
		this.msg = msg;
	}

	public CustomException(String msg, Throwable e) {
		super(msg, e);
		this.code = ErrorCode.INTERNAL_SERVER_ERROR;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
package com.hh.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hh.model.Member;

@Service
public class MemberManagerService {
	private final static Logger LOGGER = Logger.getLogger(MemberManagerService.class);

	public boolean add(Member member) {
		LOGGER.info("增加用户");
		return true;
	}

	public boolean remove(long id) throws Exception {
		LOGGER.info("删除用户");
		throw new Exception("这是自己跑出来的异常");
	}

	public boolean modify(Member member) {
		LOGGER.info("修改用户");
		return true;
	}

	public boolean query(long loginName) {
		LOGGER.info("查询用户");
		return true;
	}
}

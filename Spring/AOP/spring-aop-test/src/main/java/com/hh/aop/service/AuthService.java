package com.hh.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hh.model.Member;

@Service
public class AuthService {

	private final static Logger LOGGER = Logger.getLogger(AuthService.class);

	public Member login(String loginName, String loginPass) {

		LOGGER.info("ÓÃ»§µÇÂ¼");

		return null;
	}

	public boolean logout(String loginName) {

		LOGGER.info("×¢ÏúµÇÂ¼");

		return true;
	}

}

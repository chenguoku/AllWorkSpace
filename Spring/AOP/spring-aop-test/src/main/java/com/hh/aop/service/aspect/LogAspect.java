package com.hh.aop.service.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.apache.log4j.Logger;

public class LogAspect {
	private final static Logger LOGGER = Logger.getLogger(LogAspect.class);

	public void before(Joinpoint joinpoint) {
		LOGGER.info("方法调用之前" + joinpoint);
	}

	public void after(Joinpoint joinpoint) {
		LOGGER.info("方法调用之后" + joinpoint);
	}

	public void afterReturn(Joinpoint joinpoint) {
		LOGGER.info("方法返回之后" + joinpoint);
	}

	public void afterThrow(Joinpoint joinpoint) {
		LOGGER.info("抛出异常之后" + joinpoint);
	}
}

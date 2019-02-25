package com.hh.aop.service.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.apache.log4j.Logger;

public class LogAspect {
	private final static Logger LOGGER = Logger.getLogger(LogAspect.class);

	public void before(Joinpoint joinpoint) {
		LOGGER.info("��������֮ǰ" + joinpoint);
	}

	public void after(Joinpoint joinpoint) {
		LOGGER.info("��������֮��" + joinpoint);
	}

	public void afterReturn(Joinpoint joinpoint) {
		LOGGER.info("��������֮��" + joinpoint);
	}

	public void afterThrow(Joinpoint joinpoint) {
		LOGGER.info("�׳��쳣֮��" + joinpoint);
	}
}

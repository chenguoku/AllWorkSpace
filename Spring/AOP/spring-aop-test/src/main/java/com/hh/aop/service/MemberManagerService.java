package com.hh.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hh.model.Member;

@Service
public class MemberManagerService {
	private final static Logger LOGGER = Logger.getLogger(MemberManagerService.class);

	public boolean add(Member member) {
		LOGGER.info("�����û�");
		return true;
	}

	public boolean remove(long id) throws Exception {
		LOGGER.info("ɾ���û�");
		throw new Exception("�����Լ��ܳ������쳣");
	}

	public boolean modify(Member member) {
		LOGGER.info("�޸��û�");
		return true;
	}

	public boolean query(long loginName) {
		LOGGER.info("��ѯ�û�");
		return true;
	}
}

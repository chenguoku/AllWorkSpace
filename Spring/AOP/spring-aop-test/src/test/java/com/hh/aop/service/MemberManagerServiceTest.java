package com.hh.aop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath*:application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class MemberManagerServiceTest {

	@Autowired
	private MemberManagerService memberManagerService;

	@Test
	public void testAdd() {

		memberManagerService.add(null);

	}

	public void testRemove() {

	}

	public void testModify() {

	}

	public void testQuery() {

	}
}

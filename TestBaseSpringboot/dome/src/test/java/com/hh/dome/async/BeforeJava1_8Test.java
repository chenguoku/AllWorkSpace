package com.hh.dome.async;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hh.dome.TmallApplicationTests;

public class BeforeJava1_8Test extends TmallApplicationTests {

	@Autowired
	private BeforeJava1_8 beforeJava1_8;
	
	@Test
	public void testOne() throws Exception {
		beforeJava1_8.testOne();
	}
	
}

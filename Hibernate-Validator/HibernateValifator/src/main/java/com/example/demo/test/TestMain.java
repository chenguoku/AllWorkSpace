package com.example.demo.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.example.demo.entity.TestBean;
import org.junit.Test;

public class TestMain {

	@Test
	public void test() {
		String dateString = "20191002";
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zdt = localDate.atStartOfDay(zoneId);

		Instant instant = zdt.toInstant();
		Date date = Date.from(instant);
		
		TestBean bean = new TestBean();
		bean.setEmail("11111");
		bean.setBirthday(date);

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();

		Set<ConstraintViolation<TestBean>> validate = validator.validate(bean);
		print(validate);
	}
	
	public void print(Set<ConstraintViolation<TestBean>> set) {
		for (ConstraintViolation<TestBean> constraintViolation : set) {
			System.out.println(constraintViolation.getMessage());
			System.out.println(constraintViolation.getPropertyPath().toString());
		}
	}

}

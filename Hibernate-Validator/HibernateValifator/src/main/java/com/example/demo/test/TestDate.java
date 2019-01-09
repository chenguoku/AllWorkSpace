package com.example.demo.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.Test;

public class TestDate {

	@Test
	public void DateToLocalDate() {
		Date date = new Date();
		Instant instant = date.toInstant();
		ZoneId zoneId = ZoneId.systemDefault();// 获得当前时区

		LocalDate localDate = instant.atZone(zoneId).toLocalDate();
		System.out.println(date);
		System.out.println(localDate);
	}

	@Test
	public void LocalDateToDate() {
		ZoneId zoneId = ZoneId.systemDefault();
		LocalDate localDate = LocalDate.now();
		ZonedDateTime zdt = localDate.atStartOfDay(zoneId);

		Instant instant = zdt.toInstant();
		Date date = Date.from(instant);

		System.out.println(localDate);
		System.out.println(date);

	}

	@Test
	public void parseLocalDate() {
		String dateString = "20190102";
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		System.out.println(localDate);
	}
	
	@Test
	public void formatLocalDate() {
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("YYYY MM dd");
		System.out.println(ofPattern.format(LocalDate.now()));
	}

}

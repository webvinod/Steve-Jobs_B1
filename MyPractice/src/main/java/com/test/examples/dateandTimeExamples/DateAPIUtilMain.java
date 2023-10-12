package com.test.examples.dateandTimeExamples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateAPIUtilMain {
	public static void main(String[] args) {
		DateAPIUtil dateAPIUtil = new DateAPIUtil();
		System.out.println("Full date:  "+dateAPIUtil.getLocalDate());
		System.out.println("Time with sec:  "+dateAPIUtil.getLocalTime());
		System.out.println("Just a date:  "+dateAPIUtil.getLocalDate());
		
		Date present = dateAPIUtil.getLocalDateOne();
		LocalTime watch = dateAPIUtil.getLocalTime();
		LocalDate presentdate = dateAPIUtil.getLocalDate();

		System.out.println(LocalDate.of(1997, 9, 22));
		System.out.println(presentdate.of(2000, 8, 18));
		System.out.println(watch.getHour());
		System.out.println(watch.getMinute());
		System.out.println(watch.getSecond());
		System.out.println(watch.getNano());
		System.out.println(watch.hashCode());
		System.out.println(watch.of(23, 32, 54, 5640));
		System.out.println(watch.now());
		System.out.println(present.UTC(2023, 8, 23, 13, 25, 12));
		
	}
	

}

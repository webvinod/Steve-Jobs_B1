package com.test.examples.dateandTimeExamples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateAPIUtil {
	Date getLocalDateOne() {
		
		return new Date();
	}
	LocalTime getLocalTime() {
		
		return LocalTime.now();
	}
	LocalDate getLocalDate() {
		
		return LocalDate.now();
	}
}

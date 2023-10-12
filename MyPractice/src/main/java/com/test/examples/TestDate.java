package com.test.examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	
	static Date current_date=new Date();

	public void getDate() {
//		Date current_date;
//		current_date=new Date();
	System.out.println(current_date);
	}
	public void getFormatedDate() {
		SimpleDateFormat firstformat= new SimpleDateFormat("dd-MM-yyyy");
		String firststr=firstformat.format(current_date);
		System.out.println("Date format with dd-MM-yyyy: "+firststr);
	}
	void getFormatedDateOne() {
		SimpleDateFormat format= new SimpleDateFormat("dd-MMMM-yyyy");
		String Secondstr=format.format(current_date);
		System.out.println("Date format with dd-MMMM-yyyy:  "+Secondstr);
		format = new SimpleDateFormat("E, dd/MM/yyyy hh:mm:ss z");
		String Thirdstr=format.format(current_date);
		System.out.println("Date format with E, dd/MM/yyyy hh:mm:ss z:   "+Thirdstr);
	}
}

package com.example;

import java.util.Calendar;

public class CalendarBean {
	private Calendar cal;
	
	public CalendarBean() {
		// 생성자 생성
		cal = Calendar.getInstance();
		// 객체 생성
	}
	
	public int getYear() { return cal.get(Calendar.YEAR); }
	
	public int getMonth() { return cal.get(Calendar.MONTH) + 1; }
	
	public int getDate() { return cal.get(Calendar.DATE); }
}
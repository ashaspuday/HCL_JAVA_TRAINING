package com.dnpass.training.java.day9.timedate;

import java.util.Calendar;

public class CalendarInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal =  Calendar.getInstance();
		System.out.println("Year   : "+cal.get(Calendar.YEAR));
		System.out.println("Month  : "+cal.get(Calendar.MONTH));
		System.out.println("Date   : "+cal.get(Calendar.DATE));
		System.out.println("Hour   : "+cal.get(Calendar.HOUR));
		System.out.println("Minute : "+cal.get(Calendar.MINUTE));
	}

}

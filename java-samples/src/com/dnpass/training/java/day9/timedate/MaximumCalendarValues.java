package com.dnpass.training.java.day9.timedate;

import java.util.Calendar;

public class MaximumCalendarValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal =  Calendar.getInstance();
		System.out.println(cal.getActualMaximum(Calendar.YEAR));
		System.out.println(cal.getActualMaximum(Calendar.MONTH));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_WEEK));
		
		
	}

}

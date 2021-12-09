package com.dnpass.training.java.day9.timedate;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarfromDatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String DateandTime = "1998-11-11 04:00:02";
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(DateandTime);
			String displayDate = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss").format(date);
			System.out.println(displayDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

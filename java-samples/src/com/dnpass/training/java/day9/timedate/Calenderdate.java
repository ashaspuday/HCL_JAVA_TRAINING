package com.dnpass.training.java.day9.timedate;
import java.text.SimpleDateFormat;
import java.util.*;
public class Calenderdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 1998;
		int month = 10;
		int date =  11;
		  //Calling the current Year,month,Date,Hour,Minute
		Calendar cal =  Calendar.getInstance();
		System.out.println("Year   : "+cal.get(Calendar.YEAR));
		System.out.println("Month  : "+cal.get(Calendar.MONTH));
		System.out.println("Date   : "+cal.get(Calendar.DATE));
		System.out.println("Hour   : "+cal.get(Calendar.HOUR));
		System.out.println("Minute : "+cal.get(Calendar.MINUTE));
		
		
		//Initialize the date
		
		cal.clear();
		System.out.println();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		cal.set(Calendar.DATE,date);
		System.out.println(cal.getTime());
		
		
		System.out.println();
		
		System.out.println(cal.getActualMaximum(Calendar.YEAR));
		System.out.println(cal.getActualMaximum(Calendar.MONTH));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println(cal.getActualMinimum(Calendar.YEAR));
		System.out.println(cal.getActualMinimum(Calendar.MONTH));
		System.out.println(cal.getActualMinimum(Calendar.DATE));
		
		//Changing the Timezone
		Calendar caltime = Calendar.getInstance();
		caltime.setTimeZone(TimeZone.getTimeZone("New_York"));
		System.out.println();
		System.out.println("New York Clock");
		System.out.println("Time :      "+caltime.get(Calendar.HOUR)+"  : "
		+caltime.get(Calendar.MINUTE)+" : "+caltime.get(Calendar.SECOND));
		
		//Current Date
		Calendar now = Calendar.getInstance();
		System.out.println("Current Date&Time :      "+(now.get(Calendar.MONTH)+1)+"-"
				+now.get(Calendar.DATE)+"-"+now.get(Calendar.YEAR));
		
		
		
		//year is leap year or not
		int lyear =2165;
		if(((lyear%400==0)||(lyear%4==0))&&(lyear%100!=0))
		{
			System.out.println();
			System.out.println("Year is leap year");
		}
		else
			System.out.println();
			System.out.println("not leap year");
			
			
			//convert seconds into miliseconds
			
			
		long unixsec = 1243253353;
		Date date1 = new Date(unixsec*1000L); 
		SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy  HH:MM:SS");
		String usec = sdf.format(date1);
		System.out.println();
		System.out.println(usec);
	}

}

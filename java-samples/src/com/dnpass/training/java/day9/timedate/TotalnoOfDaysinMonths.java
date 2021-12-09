package com.dnpass.training.java.day9.timedate;

import java.util.*;

public class TotalnoOfDaysinMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the Year And Month");
       int year = sc.nextInt();
       int month = sc.nextInt();
       
       
		Calendar cal =  Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		 System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}

}

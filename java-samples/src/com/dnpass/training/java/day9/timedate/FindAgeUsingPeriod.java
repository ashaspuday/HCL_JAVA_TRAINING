package com.dnpass.training.java.day9.timedate;

import java.time.LocalDate;
import java.time.Period;

public class FindAgeUsingPeriod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   LocalDate startDate = LocalDate.of(1998, 11, 11);
   LocalDate endDate = LocalDate.of(2021, 11, 11);
   Period period = Period.between(startDate,endDate);
   System.out.println("Age:\t"+period.getYears());
   
	}

}

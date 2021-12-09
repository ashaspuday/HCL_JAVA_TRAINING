package com.dnpass.training.java.day9.timedate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Snippetrunner {

	public static void main(String[] args) {
		
		
		
		long unixsec = 1243253353;
		Date date1 = new Date(unixsec*1000L); 
		SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy  HH:MM:SS");
		String usec = sdf.format(date1);
		System.out.println();
		System.out.println(usec);

	}

}

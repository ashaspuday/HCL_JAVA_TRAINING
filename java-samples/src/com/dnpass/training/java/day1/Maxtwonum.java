package com.dnpass.training.java.day1;

import java.util.Scanner;

public class Maxtwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the 1st number\n");
		int n1 = s.nextInt(); 
		
		System.out.println("enter the 2nd number\n");
		
		int n2 = s.nextInt();
		if(n1>n2)
		   System.out.println(n1+ "is greater");
		else
		   System.out.println(n2+ "is greater");
		s.close();

	}

}

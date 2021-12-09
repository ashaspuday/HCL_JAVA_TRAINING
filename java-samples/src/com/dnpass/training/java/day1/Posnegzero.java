package com.dnpass.training.java.day1;

import java.util.Scanner;

public class Posnegzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		 if(n<0)
			 System.out.println("number is -ve");
		 else if (n>0)
			 System.out.println("number is +ve");
		 
		 else if (n==0)
			 System.out.println("number is zero");
		 sc.close();

	}
	}


package com.dnpass.training.java.day1;

import java.util.Scanner;

public class Fizzbuzz {
	

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("enter the number");
		
		 
	
		for(int i=1;i<=100;i++)
		{
			if((i%3==0) && (i%5 ==0))
			{
				System.out.println("fizzbuzz");
			}
			else if(i%3==0)
			{
				System.out.println("fizz");
			}
			else if (i%5==0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
		sr.close();
	}

}

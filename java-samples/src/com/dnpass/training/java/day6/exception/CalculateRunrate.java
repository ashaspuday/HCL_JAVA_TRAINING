package com.dnpass.training.java.day6.exception;
import java.io.IOException;
import java.util.Scanner;
public class CalculateRunrate {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the total runs scored\n");
			float run =  sc.nextLong();
			System.out.println("Enter the total overs faced\n");
			float over =  sc.nextLong();
			float result =0;
			result =run/over;
			System.out.println("Current Run Rate:\t"+result);
		}
		catch(ArithmeticException e4)
		{
			System.out.println(e4);
		}
		
	}

}

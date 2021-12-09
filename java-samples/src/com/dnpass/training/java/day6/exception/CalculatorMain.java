package com.dnpass.training.java.day6.exception;
import java.util.Scanner;
public class CalculatorMain {
	public  static final Mycalculator my_calculator = new Mycalculator();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the count\n");
		int c = sc.nextInt();
		int i=0;
		System.out.println("Enter the Numbers\n");
		do {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		try {
			long result = my_calculator.power(n1, n2);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}while(i<c);
	}

}

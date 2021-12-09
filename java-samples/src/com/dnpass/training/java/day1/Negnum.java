package com.dnpass.training.java.day1;
import java.util.Scanner;

public class Negnum {
	

public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	
	 if(n<0)
		 System.out.println("number is -ve");
	 else
		 System.out.println("number is not -ve");
	 sc.close();

}
}
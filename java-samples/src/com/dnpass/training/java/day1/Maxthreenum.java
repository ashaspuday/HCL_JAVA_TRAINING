package com.dnpass.training.java.day1;

import java.util.Scanner;

public class Maxthreenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa = new Scanner(System.in);
		System.out.println("enter the  numbers");
		int n1= sa.nextInt();
		int n2= sa.nextInt();
		int n3= sa.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(n1+"is greater");
				
			}
			else
				System.out.println(n3+"is greater");
				
		}
		else 
		{
			if(n2>n3)
				System.out.println(n2+"is greater");
			else
				System.out.println(n3+"is greater");
		}
			
    sa.close();
	}

}

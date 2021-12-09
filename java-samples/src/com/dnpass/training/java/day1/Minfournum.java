package com.dnpass.training.java.day1;

import java.util.Scanner;

public class Minfournum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa = new Scanner(System.in);
		System.out.println("enter the  numbers");
		int n1= sa.nextInt();
		int n2= sa.nextInt();
		int n3= sa.nextInt();
		int n4= sa.nextInt();
		if(n1<n2)
		{
			if(n1<n3)
			{
				if(n1<n4)
				System.out.println(n1+"is minimum");
				else
					System.out.println(n4+"is minimum");	
				
			}
			else 
			{
				if(n3<n4)
			
				System.out.println(n3+"is mininum");
				else
					System.out.println(n4+"is minimum");
				
		    }
		}
		else 
		{
			if(n2<n3) 
			{
				
				if(n2<n4)
					System.out.println(n2+"is minimum");
				else
					System.out.println(n4+"is minimum");
			}
			else
			{
				if(n3<n4)
			
				System.out.println(n3+"is minimum");
				else
					System.out.println(n4+"is minimum");
		}
		}
    sa.close();

	}

}

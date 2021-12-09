package com.dnpass.training.java.day2.loop;
import java.util.Scanner;                             //WAP TO FIND FIRST 2 EVEN NUMBERS ENTERED	
public class SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,evennumcount=0,sum=0;
		
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("enter the next number");
			n=sc.nextInt();
			if(n%2==0)
			{
				evennumcount++;
				sum+=n;
			}
		}
		while(evennumcount<2);
		System.out.println("sum is : \t"+sum);
	}

}

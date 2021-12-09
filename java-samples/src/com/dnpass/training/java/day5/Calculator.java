package com.dnpass.training.java.day5;

public  class Calculator implements AdvancedArithemetic {
	int sum=0;
	 int n;
	int i;
	public Calculator(int number)
	{
		n=number;
	}
	public  int divisor_sum(int number)
	{
		for( i=1;i<n;i++)
		{
			if(n%i==0)
			{ 
			
			sum+=i;
			}
		}
		return sum;
	}
	public void display() {
		System.out.println(divisor_sum(n)+"\nExplanation\nDivisors of\t"+n+"\tare\t");

		for( i=1;i<n;i++)
		{
			if(n%i==0)
			{ 
			System.out.println(i+",");	
			
			}
		}
		
	}
	
}

package com.dnpass.training.java.day6.exception;

public class Mycalculator {
	public static long power(int num1,int num2) throws Exception
	{
		if(num1==0&&num2==0)
		{
			throw new Exception("Numbers should not be zero");
		}
		else if(num1<0||num2<0)
		{
			throw new Exception("Numbers should not be negative");
		}
		else
		{
		return (long) Math.pow(num1, num2);
	}
}
}
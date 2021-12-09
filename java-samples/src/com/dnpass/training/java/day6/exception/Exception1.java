package com.dnpass.training.java.day6.exception;

public class Exception1
{
	private int age;
	public Exception1(int a)
	{
		age =a;
	}
	
public void entry()throws Exception
{
	if(age<18)
	{
		throw new Exception("not eligible"); 
	}
	else
	{
		System.out.println("eligible");
	}
}
}

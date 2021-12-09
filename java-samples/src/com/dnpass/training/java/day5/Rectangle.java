package com.dnpass.training.java.day5;

public class Rectangle extends Shape {
	
	private int l;
	private int b;
	public Rectangle(String Shapename,int length,int breath)
	{
		super(Shapename);
		this.l = length;
		this.b = breath;
		
	}
     
	
	public float calculateArea()
	{
		return (float) l*b;
		
	}
	public void display()
	{
		System.out.format("%.2f%n",calculateArea());
	}

	

}




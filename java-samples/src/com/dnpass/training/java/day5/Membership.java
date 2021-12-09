package com.dnpass.training.java.day5;

public class Membership extends Card{
	private int rating;
	public Membership(String hname,String cNumber, String eDate,int r)
	{
		super(hname,cNumber,eDate);
		this.rating = r;
		
	}
	public void setrating(int r)
	{
		this.rating = r;
	}

	public int getrating()
	{
		return this.rating;
	}
	public void display()
	{
		super.display();
		System.out.println(getholdername());
		System.out.println(getcardNumber());
		System.out.println(expiryDate());
		System.out.println("Membership Details\n");
		System.out.println("Rating :"+getrating());
	}
}

package com.dnpass.training.java.day5;

public class PaybackCard extends Card {
	private int pointsearned;
	private double totalAmount;
	public PaybackCard(String hname,String cNumber, String eDate,int pearned,double tamount)
	{
		super(hname,cNumber,eDate);
		this.pointsearned = pearned;
		this.totalAmount = tamount;
	}
	public void setpointsearned(int pearned)
	{
		this.pointsearned = pearned;
	}
	public int getpointsearned()
	{
		return this.pointsearned ;
	}
	public void settotalAmount(double tamount)
	{
		this.totalAmount = tamount;
	}
	public double gettotalAmount()
	{
		return this.totalAmount ;
	}
	public void display()
	{
		
		System.out.println(getholdername());
		System.out.println(getcardNumber());
		System.out.println(expiryDate());
		System.out.println("Points Earned :"+getpointsearned()+"\nTotal Amount :"+gettotalAmount());
	}
}

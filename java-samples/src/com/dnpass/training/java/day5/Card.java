package com.dnpass.training.java.day5;

public abstract class Card {

	protected String holdername;
	protected String cardNumber;
	protected String expiryDate;
	
	public Card(String hname,String cNumber, String eDate)
	{
		holdername = hname;
		cardNumber = cNumber;
		expiryDate = eDate;
	}
	public void setholdername(String hname) {
		holdername = hname;
	}
	public String getholdername()
	{
		return holdername;
	}
	public void setcardNumber(String cNumber) {
		cardNumber = cNumber;
	}
	public String getcardNumber()
	{
		return cardNumber;
	}
	public void setexpiryDate(String  eDate) {
		expiryDate = eDate;
	}
	public String expiryDate()
	{
		return expiryDate;
	}
	public void display()
	{
		System.out.println(getholdername()+"'s");
	}
}

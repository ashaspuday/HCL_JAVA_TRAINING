package com.dnpass.training.java.day3.inheritance;

public class Bicycle {
	
	private int speed;
	private int cadence;
	private int gear;
	 
	public Bicycle(int strtspeed, int strtcadence,int strtgear )
	{
		speed = strtspeed;
		cadence=strtcadence;
		gear=strtgear;
	}
	public void setcadence(int newcadence)
	{
		cadence=newcadence;
	}
	public int getcadence()
	{
		return cadence;
	}
	public void setspeed(int newspeed)
	{
		speed=newspeed;
		
	}
	public int getspeed()
	{
		return speed;
	}
	public void setgear(int newgear)
	{
		speed=newgear;
		
	}
	public int getgear()
	{
		return gear;
	}
	 public void applyBrake(int decrement)
	    {
	        speed -= decrement;
	    }
	 public void speedUp(int increment)
	    {
	        speed += increment;
	    }
	 public void printDescription()
	    {
	        System.out.println("\nBike is in gear " + gear
	                + " with a cadence of " +cadence
	                + " and travelling at a speed of " + speed + ".");
	    }
	}



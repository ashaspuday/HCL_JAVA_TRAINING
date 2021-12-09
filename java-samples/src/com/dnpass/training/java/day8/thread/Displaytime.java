package com.dnpass.training.java.day8.thread;

import java.util.Calendar;

public class Displaytime extends Thread {

	public void run()
	{
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		
		Calendar cal =  Calendar.getInstance();
		Displaytime t1 = new Displaytime();
		System.out.println(t1.getName());
        
		
	    t1.setName("MyThread");
	    System.out.println("\n Changed Name \n");
	    System.out.println(t1.getName());
	    for(int i=0;i<10;i++)
	    {
	    	 System.out.println(cal.getTime());
	    	 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

}

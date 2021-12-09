package com.dnpass.training.java.day8.thread;

public class DemoThread1UsingThread extends Thread{

	

	public void run(int round) {
		  
		System.out.println("\n running child Thread in Loop:\n");
	 
	for(int i=1;i<10;i++)
	{
		try {
			System.out.println(round+"Meters..");
			Thread.sleep(200);
			round+=10;
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread1UsingThread Thread1 = new DemoThread1UsingThread();
		DemoThread1UsingThread Thread2 = new DemoThread1UsingThread();
		DemoThread1UsingThread Thread3 = new DemoThread1UsingThread();
		
		Thread1.run(100);
		Thread2.run(200);
		Thread3.run(300);
	}

}

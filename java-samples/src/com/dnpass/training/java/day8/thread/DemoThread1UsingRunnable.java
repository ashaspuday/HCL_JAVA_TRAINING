package com.dnpass.training.java.day8.thread;

public class DemoThread1UsingRunnable implements Runnable {

	
	public DemoThread1UsingRunnable()
	{
		Thread t1 = new Thread();
		t1.start();
	}

	
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
	
		DemoThread1UsingRunnable Thread1 = new DemoThread1UsingRunnable();
		DemoThread1UsingRunnable Thread2 = new DemoThread1UsingRunnable();
		DemoThread1UsingRunnable Thread3 = new DemoThread1UsingRunnable();
		
		Thread1.run(100);
		Thread2.run(200);
		Thread3.run(300);
}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

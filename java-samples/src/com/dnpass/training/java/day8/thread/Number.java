package com.dnpass.training.java.day8.thread;

public class Number implements Runnable{
	
	public Number()
	{
		Thread t1 = new Thread();
		t1.start();
	}

	public static void main(String[] args) {
		
		Number number1 = new Number();
		Number number2 = new Number();
		Number number3 = new Number();

		number1.run(2);
		number2.run(5);
		number3.run(8);
	}

	
	public void run(int multiple) {
		
		int j=0;
		
		for(int i=1;i<=10;i++)
		{
			j= i*multiple;
			System.out.println(multiple+"*"+i+"="+j);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

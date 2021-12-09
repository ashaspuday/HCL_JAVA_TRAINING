package com.dnpass.training.java.day8.thread;

public class Simplethread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String names[]  = {"A","B","C","D"};
		
		
		for(int i=0;i<names.length;i++)
		{
			Thread.sleep(4000);
			System.out.println(names[i]);
		}
		
	}

}

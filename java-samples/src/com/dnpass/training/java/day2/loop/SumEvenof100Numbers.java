package com.dnpass.training.java.day2.loop;

public class SumEvenof100Numbers {

	public static void main(String[] args) {
		int sum = 0, evenN = 2;
	      
	      for (int i = 1; i <= 100; i++) {
	        
	         sum += evenN;
	        
	         evenN += 2;
	      }
	      System.out.println("Sum of even numbers is " + sum);
	}

}

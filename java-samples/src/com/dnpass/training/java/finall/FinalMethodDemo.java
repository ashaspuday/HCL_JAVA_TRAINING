package com.dnpass.training.java.finall;

public class FinalMethodDemo extends Bike {

	
		
	/*	   void run()
		   {
			   System.out.println("running safely with 100kmph");      COMPILE ERROR
			   }  */
		     
		   public static void main(String args[]){  
			   FinalMethodDemo honda= new FinalMethodDemo();  
		   honda.run();  
		   }  
		}  

class Bike{  
	  final void run(){System.out.println("running");}  
	}  
	     
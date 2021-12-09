package com.dnpass.training.java.finall;

public class FinalVaraibleDemo {

	
		 final int speedlimit=90; //final variable  
		 void run()
		 {  
	//	  speedlimit=400;                                                 compile error
		  System.out.println(speedlimit );
		 }  
		 public static void main(String args[]){  
			 FinalVaraibleDemo obj=new  FinalVaraibleDemo();  
		 obj.run();  
		 }  
}

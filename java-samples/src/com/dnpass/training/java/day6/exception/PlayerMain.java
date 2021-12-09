package com.dnpass.training.java.day6.exception;
import java.util.Scanner;
public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name\n");
     String name = sc.nextLine();
     System.out.println("Enter the age\n");
     int age = sc.nextInt();
    
     CustomException custom_exception = new CustomException(age,name);
     
     try {
			
    	 custom_exception.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

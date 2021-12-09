package com.dnpass.training.java.day6.exception;
import java.io.*;
import java.util.*;
public class ChecktwoIntegerTryCatch
{
	public static void main(String[] args) throws IOException {
	try
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Two Number\n");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("\n"+num1/num2);
		
	}
	catch(ArithmeticException e1)  
    {  
        System.out.println("Arithmetic Exception occurs");  
       }  
	catch (InputMismatchException e3) {
        System.out.println( e3);
     }
}
}


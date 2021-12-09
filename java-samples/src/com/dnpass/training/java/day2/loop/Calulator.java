package com.dnpass.training.java.day2.loop;
import java.util.Scanner;

public class Calulator {                          //ARITHEMATIC CALCULATOR

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s3= new Scanner(System.in);
		System.out.println("Enter the 1st Number \n");
		double N1 = s3.nextDouble();
		System.out.println("Enter the 2nd Number \n");
		double N2 = s3.nextDouble();
		System.out.println("1 : ADD \t 2 : SUBTRACT \t 3: MULTIPLY\t 4 :DIVIDE\t");
		int ch = s3.nextInt();
		double result = 0;
		
		switch(ch) {
		
		case 1 : result = N1+N2;
					break;
		case 2 :  
					if(N1>N2)
					{
						result=N1-N2;
						break;
					}
					else
					{
						result=N2-N1;
						break;
					}
		case 3 : result = N1*N2;
						break;
		case 4 : 
					if (N2==0)
					{
						System.out.println("not defined");
						break;
					}
					else 
					{
					result=N1/N2;
					break;
					}
		default : System.out.println("invalid choice");
					break;
		}
		
     System.out.println(result);

	}
	    

}

package com.dnpass.training.java.day5;
import java.util.Scanner;
public class TestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number\n");
     int num = sc.nextInt();
     Calculator cal = new Calculator(num);   //object is created
     cal.display();
	}

}

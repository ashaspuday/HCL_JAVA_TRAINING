package com.dnpass.training.java.day2.loop;
import java.util.Scanner;
                                           //find the Average,total mark of student
public class AverageMark {

	public static void main(String[] args) {
	
		
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the name : \t");
		String name = d.nextLine();
		System.out.println("Enter the age : \t");
		int age = d.nextInt();
		
		System.out.println("Enter the English mark : \t");
		double eng = d.nextDouble();
		System.out.println("Enter the Maths mark : \t");
		double math = d.nextDouble();
		System.out.println("Enter the Science mark : \t");
		double sci = d.nextDouble();
		double total = sci + math + eng;
		double avg = total/3;
		
		
	
		System.out.println("Name : \t"+name);
		System.out.println("Age : \t"+age);
		System.out.println("Total Marks : \t"+total);
		System.out.println("Average Mark Scored : \t"+avg);


		

		
		

	}

}

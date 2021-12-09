package com.dnpass.training.java.day2.loop;
import java.util.Scanner;

 class Custclass {
	String name;

	String date;
	String addr;
	String city;

	public void read()

	{

	Scanner input =new Scanner(System.in);

	System.out.print("Enter the customer name: ");

	name=input.nextLine();
	System.out.print("Enter the customer dob(dd/mm/yyyy): ");

	date=input.nextLine();

	System.out.print("Enter the customer address ");

	addr=input.nextLine();
	
	System.out.print("Enter the customer cityname ");

	city=input.nextLine();


	}

	public void display()

	{

    System.out.println(name);

    System.out.println(date);
	System.out.println(addr);
	System.out.println(city);

	
	

	}
 
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("Enter the customer details");

		Custclass[] cus=new Custclass[30];

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the number of customer: ");

		int n=sc.nextInt();

		for(int i=0;i<n;i++)

		{

		cus[i]=new Custclass();

		cus[i].read();

		}

		System.out.println("Customer Details in Required Format!");

		for(int i=0;i<n;i++)
		{
		
		cus[i].display();
	}

	}
 }

package com.dnpass.training.java.day2.loop;

import java.util.Scanner;

public class Productclass {
	String pname;

	int pcode;
	String pdesc;
	double pprice;

	public void read()

	{

	Scanner input =new Scanner(System.in);

	System.out.print("Enter the product name: ");

	pname=input.nextLine();
	System.out.print("Enter the product code ");

	pcode=input.nextInt();

	System.out.print("Enter the description ");

	pdesc=input.nextLine();
	
	System.out.print("Enter the product price ");

	pprice=input.nextDouble();


	}

	public void display()

	{

    System.out.println(pname);

    System.out.println(pcode);
	System.out.println(pdesc);
	System.out.println(pprice);

	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the customer details");

		Productclass[] pro =new Productclass[30];

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the number of product details ");

		int n=sc.nextInt();

		for(int i=0;i<n;i++)

		{

		pro[i]=new Productclass();

		pro[i].read();

		}

		System.out.println("Product Details in Required Format!");

		for(int i=0;i<n;i++)
		{
		
		pro[i].display();
	}

	
	}

}

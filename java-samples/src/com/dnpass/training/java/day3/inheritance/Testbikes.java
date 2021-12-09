package com.dnpass.training.java.day3.inheritance;

public class Testbikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1 = new Bicycle(20,30,4);
		Motorbike bike2 = new Motorbike(10,20,2,"Dual");
		Roadbike bike3 = new Roadbike(20,10,3,23);
		
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();

	}

}

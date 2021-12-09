package com.dnpass.training.java.day9.timedate;
import java.util.Scanner;
public class UserMainCode {

	
	static void checkCharacters(String str)
	{
		
		char str1 = str.charAt(0);
		char str2 = str.charAt(str.length()-1);
		if(str1==str2)
		{
			System.out.println("valid");
		}
		else
			System.out.println("Invalid");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = sc.nextLine();
		//UserMainCode obj = new UserMainCode();
		UserMainCode.checkCharacters(string);
		
}}




package com.dnpass.training.java.day2.loop;
import java.util.Scanner;                   //	Whether character is vowel or consonant
public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the character: \n");
		 char ch= s.next( ).charAt(0);	 
		 if((ch=='A')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u'))
		 {
			 System.out.println("Character is vowel");
		 }
		 else
			 System.out.println("Character is consonant");
	}

}

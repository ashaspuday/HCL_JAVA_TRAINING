package com.dnpass.training.java.day6.exception;
import java.io.*;
import java.util.Scanner;
public class FileopenUsingHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		FileReader fr = new FileReader("Textinput.txt");
		
		FileWriter fw = new FileWriter("Textoutput.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
		String str = "";
		
		int i=sc.nextInt();
		while ((i = fr.read()) != -1) 
		{
			str += (char)i;
		}
		System.out.println(str);
		fw.write(str);
		System.out.println("File reading and writing are done");
		fr.close();
		fw.close();
	}
    
    catch(IOException e)
    {
    	System.out.println("problem occured");
    }

}
}

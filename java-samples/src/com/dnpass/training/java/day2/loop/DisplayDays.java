package com.dnpass.training.java.day2.loop;
import java.util.Scanner;                         //Read 1 to 7 numbers as Days

public class DisplayDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        String  month;
        Scanner w = new Scanner (System.in);
        System.out.println("Enter the Number\n");
        n = w.nextInt();
        
        switch(n)
        {
        case 1 : month = "Monday";
        			break;
        case 2 : month = "Tuesday";
        			break;
        case 3 : month = "Wednesday";
        			break;
        case 4 : month = "Thursday";
					break;
        case 5 : month = "Friday";
					break;
        case 6 : month = "Saturday";
		   			break;
        case 7 : month = "Sunday";
					break;
        default : month = "Invalid Number";
					break;
	
        }
        System.out.println(month);
	}

}

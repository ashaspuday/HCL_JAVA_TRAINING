package com.dnpass.training.java.day5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the Card \n 1.Payback Card\n 2.Membership Card\n");
		int N =sc.nextInt();
		sc.nextLine();
		String[] in = new String[3];
		
		System.out.println("Enter the Card Details:\n");
		
		in= sc.nextLine(). split ("\\|");
		
		String a = in[0];
		String b = in[1];
		String c = in[2];
	
		
		if(N==1)
		{
			System.out.println("Enter the points in card:\n");
			int numb =sc.nextInt();
			System.out.println("Enter the Amount:\n");
			double t = sc.nextDouble();
			PaybackCard P = new PaybackCard(a,b,c,numb,t);
		    
			P.display();
			
		}
		else if(N==2)
		{
			System.out.println("Enter the RATING:\n");
			int R =sc.nextInt();
			Membership M =new Membership(a,b,c,R);
			M.display();
		}
		
	}

}

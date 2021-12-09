package com.dnpass.training.java.day7.collections;
import java.util.*;
public class FindElementsUsingBinarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> List = new ArrayList<String>();
		List.add("ASD");
		List.add("ADD");
		List.add("AED");
		List.add("AAD");
		List.add("AYD");
		List.add("AID");
		
		System.out.println(List.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name to be searched");
		String name  = sc.nextLine();
		int index ;
		index = Collections.binarySearch(List,name,Collections.reverseOrder());
		System.out.println("The name:"+name+"is at position :"+index);
	}

}

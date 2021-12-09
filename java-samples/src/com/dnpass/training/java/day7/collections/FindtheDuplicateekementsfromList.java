package com.dnpass.training.java.day7.collections;
import java.util.*;

public class FindtheDuplicateekementsfromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> i = new ArrayList<String>();
		i.add("id");
		i.add("type");
		i.add("amount");
		i.add("city");
		i.add("city");
		i.add("currency");
		i.add("currency");
		//String str =i.toString();
		System.out.println(i);
		List<String> d = new ArrayList<String>();
		
		
	/*	int n =i.size();
		for(int k=0;k<n;k++)
		{
			for(int j=1;j<n;j++)
			{
				if(i[k].equals(i[j]))
				{
					
				}
			}
	}*/
		for (String name : i)
		{ 
			if (i.add(name) == false)
			{ 
				
				// your duplicate element
				d.add(name);
				System.out.println(d);
				
				}
			}
		}
	}



package com.dnpass.training.day10.optional;
import java.util.*;
public class OptionalNullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	//	String name = null;
		String name = "ASHAS P UDAY";
	/*	Optional<String> op = Optional.ofNullable(name);
		
		if(op.isPresent())
		{
			System.out.println(op);
			System.out.println(op.get());
		}
		if(name!=null)
		{
			System.out.println(name.length());
		}
	}
*/
		Optional<String> op = Optional.of("ASHAS P UDAY");
		op.ifPresent(n->System.out.println(name.length()));
		
		
		
		
		
	}		
}

package com.dnpass.training.day10.optional;
import java.util.*;
public class Optionaldemo {

	public static void main(String[] args) {
		
		
		Optional<String> empty = Optional.empty();
		
		String str = "ASHAS P UDAY";
		Optional<String> op = Optional.of(str);
		
		if(op.isPresent())
		{
			System.out.println(op);
			System.out.println(op.get());
		}

	}

}

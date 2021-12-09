package com.dnpass.training.day10.optional;

import java.util.Optional;

public class OptionalorElse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name =null;
		
		name = Optional.ofNullable(name).orElse("with orElse");  //with orElse
		System.out.println(name);
		
		
		String name1=null;
		String str = Optional.ofNullable(name1).orElseGet(()->"with orElseGet");  //with orElseget
		System.out.println(str);
		
		String name2=null;
		String str1 = Optional.ofNullable(name2).orElseThrow(IllegalArgumentException::new);  //with orElseThrow
		System.out.println(str1);

	}

}

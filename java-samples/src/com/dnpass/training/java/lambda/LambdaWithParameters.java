package com.dnpass.training.java.lambda;

import com.dnpass.training.java.lambda.LambdaWithoutParameters.Sayable;

public class LambdaWithParameters {

	interface Sayable 
	{
		public String say(String name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Sayable s1 =(name)->{
			return "Hello  "+name;
		};
		System.out.println(s1.say("Ashas"));
		
	}

}

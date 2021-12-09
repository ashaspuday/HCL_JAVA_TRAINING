package com.dnpass.training.java.lambda;

public class LambdaWithoutParameters {

	
	interface Sayable 
	{
		public String say();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable s1 =()->{
			return "I'm Ashas";
		};
		System.out.println(s1.say());
	}

}

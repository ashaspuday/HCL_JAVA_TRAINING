package com.dnpass.training.java.annotations;

public class Overideannotaion {

			void eatSomething(){System.out.println("eating something");}  
			}  
			  
			class Dog extends Overideannotaion{  
			@Override  
			void eatSomething()
			{
				System.out.println("eating foods");}//should be eatSomething  
			}  
			  
			class TestAnnotation1{  
			public static void main(String args[]){  
				Overideannotaion a=new Dog();  
			a.eatSomething();  
			} 
	}



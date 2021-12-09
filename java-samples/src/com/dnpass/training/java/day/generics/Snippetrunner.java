package com.dnpass.training.java.day.generics;


import java.util.*;

public class Snippetrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericBox<Integer> integerBox;
		integerBox=new GenericBox<Integer>();
		
		GenericBox<Integer> integerBox1=new GenericBox<Integer>();
		
		Pair<String,Integer> p1=new OrderedPair<>("Even",8);
		Pair<String,String> p2=new OrderedPair<>("hello","world");
		
		OrderedPair<String,GenericBox<Integer>> p=new OrderedPair<>("prime",new GenericBox<>());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p);
		

	}

}

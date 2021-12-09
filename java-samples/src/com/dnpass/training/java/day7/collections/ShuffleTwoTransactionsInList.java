package com.dnpass.training.java.day7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTwoTransactionsInList {

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
		
		System.out.println(i.toString());
		Collections.shuffle(i);
		System.out.println(i.toString());

	}

}

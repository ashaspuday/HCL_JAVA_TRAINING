package com.dnpass.training.java.streams;

import java.util.stream.Stream;

public class Snippetrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> numbersFromValues = Stream.of(1,2,3,4);

		System.out.println(numbersFromValues);
	}

}

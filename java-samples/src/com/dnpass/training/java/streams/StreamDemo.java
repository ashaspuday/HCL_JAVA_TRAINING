package com.dnpass.training.java.streams;
import static  java.util.Comparator.comparing;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamDemo {
	public static void main(String[] args) throws IOException {
		
		StreamDemo streamdemo = new StreamDemo();
		streamdemo.demo();

}
	
	private void demo() throws IOException {
		
		//Building Streams
		Stream<Integer> numbersFromValues = Stream.of(1,2,3,4);

		System.out.println(numbersFromValues);
		int[] numbersArray  = {1,2,3,4};
		IntStream numbersFromArray =  Arrays.stream(numbersArray);
		System.out.println(numbersFromArray );
		
		//Referencing a Stream

		

		Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));

		Optional <String> anyElement = stream.findAny();

		Optional<String> firstElement= stream.findFirst(); // an attempt to reuse the same reference.

		// terminal operation will trigger the

		// IllegalStateException:

		List<String> elements = Stream.of("a", "b", "c").filter (element -> element.contains("b")) .collect(Collectors.toList());

		anyElement = elements.stream().findAny(); firstElement = elements.stream().findFirst();

		List<String> list = Arrays.asList("abc1", "abc2", "abc3");

		Stream<String> streaml =  list.stream().filter (element -> {

		System.out.println("filter() was called"); return element.contains("2");

		}).map(element -> {

		System.out.println("mep() was called");

		return element.toUpperCase();

		});

		
				Optional <String> string = list.stream().filter (element -> { System.out.println("filter() was called");

				return element.contains ("2"); }).map (element -> {

				System.out.println("map() was called"); 
				return element.toUpperCase();

				}).findFirst();

				long size=list.stream().map (element -> { System.out.println("map() was called"); 
				return element.substring (0, 3); }).skip (2).count();

				size = list.stream().skip (2).map (element -> { System.out.println("map() was called");

				return element.substring(0, 3);
				}).count();
	}
}
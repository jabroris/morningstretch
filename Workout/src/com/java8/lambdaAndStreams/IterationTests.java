package com.java8.lambdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class IterationTests {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 12, 32, 44, 55, 43);
		
//		intList.forEach(value -> System.out.println(value + " one way of doing this"));
		
//		intList.forEach(System.out::println);
		
//		intList
//				.stream()
//				.map(e -> String.valueOf(e))
//				.map(String::toString)
//				.forEach(System.out::println);
		
		intList
				.stream()
				.map(e -> e.toString())
				.forEach(System.out::println);
		
		System.out.println("========================\n");
		
		System.out.println(
				intList.stream()
						.reduce(0, Integer::sum));
		
		System.out.println("========================\n");
		
		System.out.println(
				intList.stream()
				.map(String::valueOf)
				.reduce("", String::concat));
		
		System.out.println("========================\n");
	
		intList.stream()
				.filter(e -> e % 2 == 0)
				.forEach(System.out::println);
		
		System.out.println("=========================\n");
	}
}

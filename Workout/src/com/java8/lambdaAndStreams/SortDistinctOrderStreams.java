package com.java8.lambdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class SortDistinctOrderStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9 ,10, 11, 2, 3, 4, 5, 6, 11, 10, 9, 1);
		
		numbers.stream()
				.sorted()
				.distinct()
				.forEach(System.out::println);
	}
}

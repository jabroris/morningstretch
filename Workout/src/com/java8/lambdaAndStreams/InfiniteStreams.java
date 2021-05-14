package com.java8.lambdaAndStreams;

import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
//		Stream.iterate(105, e -> e + 1)
//				.filter(e -> e > 105)
//				.limit(10)
//				.forEach(System.out::println);
		
		//Given a number k and count n, find the double of n even numbers,
		//starting with k, where sqrt of each number is greater than 20
		
		int k = 11;
		int n = 3;
		
		System.out.println(compute(k, n));
	}
	
	public static int compute(int k, int n) {
		
		return Stream.iterate(k, e -> e + 1)
//				.filter(e -> e % 2 == 0)
				.filter(e -> Math.sqrt(e) > 20)
				.mapToInt(e -> e )
				.limit(n)
				.sum();
		
		
//		return Stream.iterate(k, e -> e + 1)
//					.filter(e -> e % 2 == 0)
//					.filter(e -> Math.sqrt(e) > 20)
//					.mapToInt(e -> e * 2)
//					.limit(n)
//					.sum();
	}
}

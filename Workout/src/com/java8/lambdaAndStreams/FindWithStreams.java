package com.java8.lambdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class FindWithStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9 ,10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
	
		//given an ordered list find the double of the first even number 
		//greater than 3.
		
		System.out.println(
				numbers.stream()
						.filter(e -> e % 2 == 0)
						.filter(e -> e > 3)
						.map(e -> e * 2)
						.findFirst());
		
		System.out.println("\n=============================\n");
		
		System.out.println(
				numbers.stream()
				.filter(FindWithStreams::isGT3)
				.filter(FindWithStreams::isEven)
				.map(FindWithStreams::doubleIt)
				.findFirst());
	}
	
	public static boolean isGT3(int n) {
		return n > 3;
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static int doubleIt(int n) {
		return n * 2;
	}
}

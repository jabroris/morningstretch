package com.exercises.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamThings {

	public static void main(String[] args) {
		
		Random random = new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);
	}
}

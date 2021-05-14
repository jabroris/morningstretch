package com.java8.lambdaAndStreams;

import java.util.function.Consumer;

public class LambdaPlayground {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = (String s) -> System.out.println(s);
		
		consumer.accept("Hello idiot");
	}
}

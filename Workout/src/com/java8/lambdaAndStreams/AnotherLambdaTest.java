package com.java8.lambdaAndStreams;

public class AnotherLambdaTest {

	public static void main(String[] args) {
		
		Thread th = new Thread(() -> System.out.println("In another thread"));
		
		th.start();

		System.out.println("in main thread");
	}
}

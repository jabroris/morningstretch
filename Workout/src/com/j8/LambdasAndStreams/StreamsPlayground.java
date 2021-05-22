package com.j8.LambdasAndStreams;

import java.math.BigInteger;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.LongStream;

public class StreamsPlayground {

	public static void main(String[] args) {
		
		long number = 21;
		StreamsPlayground sp = new StreamsPlayground();
		
		System.out.println(sp.factorial(number));
		
		List<IntUnaryOperator> operators = List.of(i -> i + 1, i -> i * 2, i -> i + 3);
		
		
		System.out.println(sp.combine(operators).applyAsInt(5));
	}
	
	public BigInteger factorial(long number) {
		return LongStream.rangeClosed(1, number)
							.mapToObj(BigInteger::valueOf)
							.reduce(BigInteger.ONE, BigInteger::multiply);
	}
	
	public IntUnaryOperator combine(List<IntUnaryOperator> operators) {
		return operators.stream()
						.reduce(IntUnaryOperator.identity(), IntUnaryOperator::andThen);
	}
}

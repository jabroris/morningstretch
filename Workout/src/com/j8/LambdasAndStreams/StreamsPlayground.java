package com.j8.LambdasAndStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;
import java.util.regex.Pattern;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.*;

public class StreamsPlayground {

	final static Pattern SPLIT_PATTERN = Pattern.compile("[-,;: .]+");

	public static void main(String[] args) {
		
		long number = 21;
		StreamsPlayground sp = new StreamsPlayground();
		
		System.out.println(sp.factorial(number));
		
		List<IntUnaryOperator> operators = List.of(i -> i + 1, i -> i * 2, i -> i + 3);
		
		
		System.out.println(sp.combine(operators).applyAsInt(5));
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("sonnet.txt"));
			
			System.out.println(sp.extractLastWord(reader));
			
			BufferedReader readerToMap = new BufferedReader(new FileReader("sonnet.txt"));
			
			sp.createMapForDuplicates(readerToMap);
			
			BufferedReader readerGroupBy= new BufferedReader(new FileReader("sonnet.txt"));
			
//			sp.groupByFirstLetter(readerGroupBy);
			
			sp.groupByLetters(readerGroupBy);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Find factorial of number
	public BigInteger factorial(long number) {
		return LongStream.rangeClosed(1, number)
							.mapToObj(BigInteger::valueOf)
							.reduce(BigInteger.ONE, BigInteger::multiply);
	}
	
	public IntUnaryOperator combine(List<IntUnaryOperator> operators) {
		return operators.stream()
						.reduce(IntUnaryOperator.identity(), IntUnaryOperator::andThen);
	}
	
	//Last word in the file (using split_pattern to separate each word
	public String extractLastWord(BufferedReader reader) {
		return reader.lines()
					.flatMap(line -> SPLIT_PATTERN.splitAsStream(line))
					.reduce("", (a,b) -> b);
	}
	
	//Take the first letter of each line as a key. 
	//If duplicate keys then merge values with --- between them 
	//key = first letter of the line
	//value = line (or lines if two or more lines start with the same letter
	public void createMapForDuplicates(BufferedReader reader) {
		Map<String, String> map = reader.lines()
										.collect(toMap(line -> line.substring(0, 1),
												line -> line,
												(line1, line2) -> line1 + "---" + line2));
		System.out.println("\n---------------------------------------------------");
		
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}
	
	//Length of lines in the file and count of how many lines have that length
	//key = length of the line
	//value = count of lines with that length
	public void groupByFirstLetter(BufferedReader reader) {
		Map<String, Long> map = reader.lines()
										.collect(groupingBy(line -> String.valueOf(line.length()),
												counting()));
		
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}
	
	
	//Each letter in the file grouped and their count
	//key = letter
	//value = count of letters
	public void groupByLetters(BufferedReader reader) {
		Map<String, Long> map = reader.lines()
											.flatMap(s -> s.codePoints()
															.mapToObj(k -> Character.toString((char) k)))
											.collect(groupingBy(c -> c, counting()));
		
		map.forEach((letter, count) -> System.out.println(letter + " => " + count));	
	}
	
		
}

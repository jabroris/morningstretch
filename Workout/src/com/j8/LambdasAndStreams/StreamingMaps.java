package com.j8.LambdasAndStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.*;

public class StreamingMaps {

	final static Pattern pattern = Pattern.compile("[-,;: .]+");
	
	public static void main(String[] args) {
		
			
		StreamingMaps sm = new StreamingMaps();		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("sonnet.txt"));
			
			Map<String, Long> words = reader.lines()
											.map(String::toLowerCase)
											.flatMap(pattern::splitAsStream)
											.collect(
													groupingBy(
															word -> word, counting()));
			
			words.forEach((key, value) -> System.out.println(key + " => " + value));							
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

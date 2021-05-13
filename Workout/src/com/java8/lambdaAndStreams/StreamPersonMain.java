package com.java8.lambdaAndStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.*;

public class StreamPersonMain {

	public static List<StreamPerson> createPeople() {
		return Arrays.asList(
				new StreamPerson("Sara", GENDER.FEMALE, 20),
				new StreamPerson("John", GENDER.MALE, 33),
				new StreamPerson("Sara", GENDER.FEMALE, 35),
				new StreamPerson("John", GENDER.MALE, 23),
				new StreamPerson("Mark", GENDER.MALE, 28),
				new StreamPerson("Will", GENDER.MALE, 33),
				new StreamPerson("Jill", GENDER.FEMALE, 33),
				new StreamPerson("James", GENDER.MALE, 35));
	}
	
	public static void main(String[] args) {
		
		List<StreamPerson> peepsList = createPeople();
		
		//create a Map with name and age as key, and the gender as value
		//This is a map (not a HashMap). You can cast it but need to add suppress 
		System.out.println(
					peepsList.stream()
							.collect(toMap(
									person -> person.getName() + " - " + person.getAge(),
									person -> person.getGender())));
		
		System.out.println("\n================================================\n");
		
		
		System.out.println(
				peepsList.stream()
					.collect(groupingBy(StreamPerson::getName,
							mapping(StreamPerson::getAge, toList()))));
	}
}

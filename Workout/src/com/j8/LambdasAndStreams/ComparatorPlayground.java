package com.j8.LambdasAndStreams;

import java.util.Comparator;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ComparatorPlayground {

	static Person michael = new Person("Michael", "Jackson", 33);
	static Person rod = new Person("Rod", "Stewart", 54);
	Person paul = new Person("Paul", "McCartney", 74);
	Person mick = new Person("Mick", "Jagger", 73);
	static Person jermaine = new Person("Michael", "Jackson", 13);
	
	public static void main(String[] args) {
		
		
		Function<Person, String> getLastName = p -> p.getLastName();
		Function<Person, String> getFirstName = p -> p.getFirstName();
		Function<Person, Integer> getAge = p -> p.getAge();
		
		Comparator<Person> cmp = Comparator.comparing(getLastName)
											.thenComparing(getFirstName)
											.thenComparing(getAge);
		
		System.out.println("michael and jer = " + cmp.compare(michael, jermaine));
		System.out.println("michael and rod = " + cmp.compare(michael, rod));
	}
	
	
//	@Test
//	public void comparator_1() {
//		Comparator<Person> cmp = ; //TODO
//		
//		assertThat(cmp.compare(michael, rod)).isLessThan(0);
//		assertThat(cmp.compare(paul, paul)).isLessThan(0);
//		assertThat(cmp.compare(mick, null)).isLessThan(0);
//		assertThat(cmp.compare(null, mick)).isLessThan(0);
//		
//	}
	
//	private static Comparator<Person> getComparator(Function<Person, String> getLastName) {
//		return new Comparator<Person>() {
//			@Override
//			public int compare(Person p1, Person p2) {
//				
//				String lastName1 = getLastName.apply(p1);
//				String lastName2 = getLastName.apply(p2);
//				return lastName1.compareTo(lastName2);
//			}
//		};
//	}
}

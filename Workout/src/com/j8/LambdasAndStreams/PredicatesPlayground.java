package com.j8.LambdasAndStreams;

import java.util.function.Predicate;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;


public class PredicatesPlayground {
	
//	@Test
	public void predicate_1() {
		
		Predicate<String> p1 = s -> s.isEmpty();
		
		Predicate<String> notPredicate = p1.negate(); //TODO
		
		assertThat(notPredicate.test("")).isFalse();
		assertThat(notPredicate.test("Not empty!")).isTrue();
	}
	
//	@Test
	public void predicate_p2() {
		Predicate<String> p1 = s -> s != null;
		Predicate<String> p2 = s -> s.isEmpty();
		
		Predicate<String> p3 = p1.and(p2);	//TODO
		
		assertThat(p3.test("")).isTrue();
		assertThat(p3.test(null)).isFalse();
		assertThat(!p3.test("Not empty!")).isTrue();
	}
	
	@Test
	public void predicate_3() {
		Predicate<String> p1 = s -> s.length() == 4;
		Predicate<String> p2 = s -> s.startsWith("J");
		
		Predicate<String> p3 = p1.and(p2).negate(); //TODO
		
		assertThat(p3.test("True")).isTrue();
		assertThat(p3.test("Julia")).isTrue();
		assertThat(p3.test("Java")).isFalse();
	}

}

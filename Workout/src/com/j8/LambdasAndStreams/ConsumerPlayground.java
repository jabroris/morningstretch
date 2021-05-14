package com.j8.LambdasAndStreams;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPlayground {

	@Test
	public void consumer_1() {
		
		Consumer<List<String>> consumer = List::clear;
		
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
		
		consumer.accept(list);
		
		assertThat(list).isEmpty();
	}
	
	@Test
	public void consumer_2() {
		
		Consumer<List<String>> c1 = list -> list.add("first");
		Consumer<List<String>> c2 = list -> list.add("second");
		
		Consumer<List<String>> consumer = c1.andThen(c2); //TODO
		
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
		
		consumer.accept(list);
		
		assertThat(list).containsExactly("a", "b", "c", "first", "second");
		
		System.out.println("list: " + list);
	}
}


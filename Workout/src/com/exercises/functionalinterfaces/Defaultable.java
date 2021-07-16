package com.exercises.functionalinterfaces;

public interface Defaultable {

	default String notRequired() {
		return "something";
	}
	
	static int defNotRequired() {
		return 1;
	}
	
	default boolean boolNotRequired() {
		return false;
	}
}

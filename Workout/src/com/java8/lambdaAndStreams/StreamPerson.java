package com.java8.lambdaAndStreams;

enum GENDER { MALE, FEMALE};

public class StreamPerson {

	private String name;
	private GENDER gender;
	private int age;
	
	public StreamPerson(String name, GENDER gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return getName() + " " + getGender() + " " + getAge();
	}
}

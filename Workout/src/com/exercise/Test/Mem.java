package com.exercise.Test;

class Student {
	public void displayValue() {};
}	

public class Mem extends Student  {
	String value; // = "string";
	public String getValue() {
		return this.value;
	}
	
	public static void main(String[] args) {
		Mem stu = new Mem();
		System.out.println(((Mem)stu).getValue());
	}
}

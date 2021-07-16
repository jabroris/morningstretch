package com.exercises.numbers;

public class BitManipulation {
	
	public static void main(String[] args) {
	
		int bits;
		bits = -1;
		System.out.println(bits);
		System.out.println(Integer.toBinaryString(bits));
		System.out.println();
	    bits = -3 << 5;
	    System.out.println(bits);
	    System.out.println(Integer.toBinaryString(bits));
	    System.out.println();
	    bits = bits >>> 2;
	    System.out.println(bits);
	    System.out.println(Integer.toBinaryString(bits));
	    System.out.println();
	    bits = bits << 1;
	    System.out.println(bits);
	    System.out.println(Integer.toBinaryString(bits));
	    System.out.println(bits);
	}
}

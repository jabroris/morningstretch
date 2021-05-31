package com.catcoder;

import java.util.Scanner;

/*
 * Find the perimeter of koch snowflake
 */

public class Fractal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Fractal f = new Fractal();
		
		int length = scan.nextInt();
		int iterations = scan.nextInt();
		
		System.out.println("Triangle = " + f.tri(length, iterations));
		System.out.println();
		System.out.println("Square = " + f.sq(length, iterations));
		
		scan.close();
	}
	
	public double tri(int length, int iterations) {
		return (3 * Math.pow(4, iterations) * (length / Math.pow(3, iterations)));
	}
	
	public double sq(int length, int iterations) {
		return (4 * Math.pow(5, iterations) * (length / Math.pow(3, iterations)));
	}
}

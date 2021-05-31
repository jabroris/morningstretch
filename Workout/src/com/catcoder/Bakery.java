package com.catcoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Bakery {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String[] input = scan.nextLine().split(" ");
		
		HashMap<Integer, Integer> f = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < input.length; i++) {
			
			if(input[i].equals("F")) {
				f.put(Integer.parseInt(input[++i]), Integer.parseInt(input[++i]));
				
			} else if(input[i].equals("B")) {
				b.put(Integer.parseInt(input[++i]), Integer.parseInt(input[++i]));
			}
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		f.forEach((i,j) -> { if(f.get(i).intValue() != b.get(i).intValue()) {
								result.add(i);
							 } else {} 
						   } );
		
		result.sort(Comparator.naturalOrder());
		
		result.forEach(i -> System.out.print(i + " "));
	}
}

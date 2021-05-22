package javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Recursion {
	
	public static void main(String[] args) {
		Recursion rec = new Recursion();
//		System.out.println(rec.factorial(16));
		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		System.out.println(rec.fibonacci(input));
		
//		List<Integer> numbers = new ArrayList<Integer>();
		
		int it = scan.nextInt();
		int[] numbers = new int[it];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		rec.pairs(numbers);
		
		scan.close();
	}
	
	public int fibonacci(int n) {
				
		if(n <= 1)
			return n;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	/* This is an exercise from CatCoder which is asking for 
	 * oriented pairs in a permutation. 
	 * An oriented pair
	 *	� is a pair of consecutive integers (not necessarily
	 *	  directly after each other)
	 *		with |xi| - |xj| = �1
	 *	� always consists of a negative number and apositive one
 	 * Permutation P = (3 1 6 5 -2 4) has 2
	 * oriented pairs: (1, -2) and (3, -2)
	 */
	public String pairs(int[] perm) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		String result = "";
		for(int i = 0; i < perm.length; i++) {
			for(int j = i+1; j < perm.length; j++) {
				if((Math.abs(Math.abs(perm[i]) - Math.abs(perm[j])) == 1 )
					&& (((perm[i] > 0) && (perm[j] < 0)) || ((perm[i] < 0) && (perm[j] > 0)))) {
							map.put(perm[i], perm[j]);
				}
			}
		}
		List<Integer> list = map.keySet().stream()
											.sorted()
											.collect(Collectors.toList());
		System.out.print(list.size());
		list.forEach(i -> System.out.println(i + " " + map.get(i)));
		
		return result;
	}
	
}


//public int factorial(int n)
//{
//	if(n==1)
//		return n;
//	else 
//		return n * factorial(n-1);
//}
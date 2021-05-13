package javabasics;

public class Recursion {
	
	public static void main(String[] args) {
		Recursion rec = new Recursion();
		System.out.println(rec.factorial(16));
	}
	
	public int factorial(int n)
	{
		if(n==1)
			return n;
		else 
			return n * factorial(n-1);
	}
}

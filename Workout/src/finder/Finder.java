package finder;

import java.util.Scanner;

public class Finder 
{
	public static void main(String [] args) 
	{
		Finder f = new Finder();
		
		// Testing findMax
		long[] list = {23, 43, 565, -3, 4235, 78, 3489, 9849, 5825, 4889, 982, 6789, 156, 456, 86};
		System.out.println(f.findMax(list));
		
		//----------------
		
		
		// Testing isPrime
		System.out.println("Enter a number and I will check if it's prime or not!");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		System.out.println("Is the number " + input + " prime? - " + f.isPrime(Integer.parseInt(input)));
		//-----------------
	
		
		// Testing fibonacci
		System.out.println("The 5th element of fibonacci sequence is " + f.nthFibonacci(5));
	}

	public long findMax(long [] list)
	{
		long max = 0;
		if(list == null || list.length == 0)
			return max;
		for(int i = 0; i < list.length; i++)
		{
			if(list[i]>max)
				max = list[i];
		}
		return max;
	}
	
	public boolean isPrime(int num)
	{
		int x = num/2;
		for(int i = 2; i < x; i++)
		{
			if(num%i==0)
			{
				System.out.println("It divides by " + i);
				return false;
			}
		}
		return true;
	}
	
	public int nthFibonacci(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		System.out.println(n);
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
}

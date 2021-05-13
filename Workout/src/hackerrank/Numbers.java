package hackerrank;

import java.util.Scanner;

public class Numbers {
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int i = 0; i < count; i++)
		{
			int number = scan.nextInt();
			System.out.println(primeNumber(number));
		}
	}
	
	public static String primeNumber(int number)
	{
		if(number == 1 || number == 0)
			return "Not prime";
		int divisor = (int)Math.sqrt(number);
		while(divisor > 1)
		{
			//System.out.println("number = " + number + "  |  divisor = " + divisor
			//1					+ "  |  number%divisor = " + (number%divisor));
			if(number%divisor == 0)
			{
				return "Not Prime";
			}
			else
				divisor--;
		}
		return "Prime";
	}

}

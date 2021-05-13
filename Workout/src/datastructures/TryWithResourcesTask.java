package datastructures;

import java.util.Scanner;

/*
 * x1.   	public static <T> T[] convertArray(Object[] arr, Class<? extends T> clazz){

- Please write the implementation of this function.
	There are ready written unit tests (can be run online) that test with:
	
		- Receive Array of Classes of Int [] as parameter of this functions
			-> Return Array of Classes of String [] as output
			
		- Receive Array of Classes of String [] as parameter of this functions 
			-> Return Class of Int [] as output
			
		- Receive Array of Classes of Double[] as parameter of this functions 
			-> Return Class of String[] as output
}
 
2.   	public class TryWithResourcesTask  {
 */

public class TryWithResourcesTask implements Runnable 
{
	interface StateOperations 
	{
		public default void changeOperation(int deepness)
		{
			System.out.println(deepness);
		}
	
		public int num();
 
		public enum StateTask implements StateOperations
		{
			S1 
			{
				public void changeOperation(int deepness)
				{
					S2.changeOperation(deepness + 1);
				}
			},
			S2,
			S3 
			{
				public void changeOperation(int deepness) 
				{
					S2.changeOperation(deepness - 2);
				}
			};
			
			public int num()
			{
				return 1;
			}
			
		}
		public static void main(String[] args) 
		{
			StateTask.S1.changeOperation(1);
			System.out.println(StateTask.S1.num());
			
			Scanner scan = new Scanner(System.in);
			int myInt = scan.nextInt();
			double myDouble = scan.nextDouble();
			scan.nextLine();
			String myString = "";
			myString = scan.nextLine();
			
			
			System.out.println(myString);
			System.out.println(myInt);
			System.out.println(myDouble);
			
			scan.close();
			System.out.println(Short.MIN_VALUE);
			System.out.println(Short.MAX_VALUE);
			
			String[] reverseStr = {"I", "want", "to", "see", "this", "in", "reverse", "order"};
			for(int i = 0; i < reverseStr.length/2; i++)
			{
				String temp = reverseStr[i];
				reverseStr[i] = reverseStr[reverseStr.length-1-i];
				reverseStr[reverseStr.length-1-i] = temp;
			}
			
			for(int i = 0; i < reverseStr.length; i++)
				System.out.print(reverseStr[i] + " ");
		}
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		
	}
}



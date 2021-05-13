package strings;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PetyaVacay {
	
	public static void main(String [] args) {
		
		final double puzzle 	= 2.60;
		final double doll 		= 3.00;
		final double bear 		= 4.10;
		final double minion 	= 8.20;
		final double truck 		= 2.00;
		final double discount 	= 0.25;
		final double rent 		= 0.10;
		
		double vacationCost = 0.00;
		
		int numOfPuzzles = 0;
		int numOfDolls = 0;
		int numOfBears = 0;
		int numOfMinions = 0;
		int numOfTrucks = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your vacation cost.");
		vacationCost = scan.nextDouble();
		
		System.out.println("Please enter number of puzzles you would like to purchase.");
		numOfPuzzles = scan.nextInt();
		System.out.println("Please enter number of dolls you would like to purchase.");
		numOfDolls = scan.nextInt();
		System.out.println("Please enter number of bears you would like to purchase.");
		numOfBears = scan.nextInt();
		System.out.println("Please enter number of minions you would like to purchase.");
		numOfMinions = scan.nextInt();
		System.out.println("Please enter number of Trucks you would like to purchase.");
		numOfTrucks = scan.nextInt();
		
		int totalCount = numOfPuzzles 
					+ numOfDolls 
					+ numOfBears 
					+ numOfMinions 
					+ numOfTrucks;
		
		double revenue = numOfPuzzles*puzzle 
					+ numOfDolls*doll 
					+ numOfBears*bear 
					+ numOfMinions*minion 
					+ numOfTrucks*truck;
		
//		System.out.println("revenue before discount = " + revenue);
		if(totalCount >= 50)
			revenue -= revenue*discount;  //this is equal to revenue = revenue - revenue*discount
		
//		System.out.println("revenue after discount = " + revenue);
		
		//this is basically equal to revenue = revenue - revenue*rent
		revenue -= revenue*rent;
		
		
//		System.out.println("revenue after rent = " + revenue);
		//this is a Java library more info in the java docs
		DecimalFormat df = new DecimalFormat("#,###.##");
		
		if(revenue < vacationCost)
			System.out.println("Not enough money! " + df.format(vacationCost-revenue) + " lv. needed   revenue = " + revenue);
		else
			System.out.println("Yes! " + df.format(revenue-vacationCost) + " lv. left.  revenue = " + revenue);
		
		scan.close();
	}
}

package hackerrank;

import java.util.Scanner;

public class LibraryDues {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double fine = 0.0;
		
		int returnDay = scan.nextInt();
		while(returnDay < 1 || returnDay > 31)
		{
			System.out.println("Please enter a valid day!");
			returnDay = scan.nextInt();
		}
		
		int returnMonth = scan.nextInt();
		while(returnMonth < 1 || returnMonth > 12)
		{
			System.out.println("Please enter a valid month!");
			returnMonth = scan.nextInt();
		}
		
		int returnYear = scan.nextInt();
		while(returnYear < 1 || returnYear > 3000)
		{
			System.out.println("Please enter a valid year!");
			returnYear = scan.nextInt();
		}
		
		int dueDay = scan.nextInt();
		while(dueDay < 1 || dueDay > 31)
		{
			System.out.println("Please enter a valid day!");
			dueDay = scan.nextInt();
		}
		
		int dueMonth = scan.nextInt();
		while(dueMonth < 1 || dueMonth > 12)
		{
			System.out.println("Please enter a valid month!");
			dueMonth = scan.nextInt();
		}
		
		int dueYear = scan.nextInt();
		while(dueYear < 1 || dueYear > 3000)
		{
			System.out.println("Please enter a valid year!");
			dueYear = scan.nextInt();
		}
		
		if(dueYear >= returnYear) {
            if(dueMonth >= returnMonth) {
                if(dueDay >= returnDay) {
                    fine = 0;
                } else {
                    fine = (returnDay - dueDay)*15;
                }
            } else {
                fine = (returnMonth - dueMonth)*500;
            }
        } else {
            fine = 10000;
        }
        System.out.println(fine);
        scan.close();
	}

}

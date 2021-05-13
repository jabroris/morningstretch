package hackerrank.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSortMain {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        
    	int n = 5; //in.nextInt();
        int[] a = {23, 3, 44, 12, 8};
        
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
        
        // Write Your Code Here
        int countSwaps = 0;
        for(int i = 0; i < n; i++)
        {
        	int swap = 0;
		    for(int j = 0; j < a.length-1; j++)
		    {
		        int temp = a[j];
		        if(a[j] > a[j+1])
		        {
		            a[j] = a[j+1];
		            a[j+1] = temp;
		            swap++;
		            countSwaps++;
		        }
		    }
		    System.out.println(swap);
		    if(swap == 0)
		    	break;
		}
        
        for(int i = 0; i < n; i++)
        	System.out.print( a[i] + " ");
        System.out.println("\nNumber of swaps: " + countSwaps);
    }
}



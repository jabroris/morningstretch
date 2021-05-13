package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BitwiseOp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            int max = 0;
            
            for(int i = n; i > 0; i--) {
            	for(int j = i - 1; j > 0; j--) {
            		System.out.println("i = " + i + ";   \nj = " + j + ";  \ni & j = " + (i & j));
            		if((i & j) < k && (i & j) > max)
            			max = (i & j);
            	}
            }
            
            System.out.println(max);
        }

        scanner.close();
    }
}

package hackerrank;

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 *  Find the max sum of the hourglass number in the matrix.
 *  In this case the matrix is 6x6.
 */

public class Hourglass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int finalSum = Integer.MIN_VALUE;
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum > finalSum)
                    finalSum = sum;
                System.out.println(sum);
            }
        }
        System.out.println(finalSum);
        scanner.close();
    }
}

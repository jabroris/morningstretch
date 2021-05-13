package hackerrank;

import java.util.*;

/*
 * Count the max number of consecutive 0s or 1s there are in the bin string
 */

public class ConsecChar {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binNum = scanner.nextLine();
        int count = 1;
        int result = 1;
        char prevChar = '0';
        
        for(int i = 0; i < binNum.length(); i++)
        {
            if(binNum.charAt(i)=='1')
            {
                if(prevChar=='0')
                {
                    prevChar = '1';
                    count = 1;
                    continue;
                }
                count++;
                if(count > result)
                	result = count;
            }
            else
            {
                prevChar = '0';
            }
        }

        System.out.println(result);
        scanner.close();
    }
}




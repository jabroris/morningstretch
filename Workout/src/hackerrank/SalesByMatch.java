package hackerrank;

import java.io.*;
import java.util.*;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int count = 1;
    	int pairs = 0;
    	ArrayList<Integer> arrList = new ArrayList<Integer>();
    	
    	for(int i = 0; i < ar.length; i++) {
    		arrList.add(ar[i]);
    	}
    	
    	for(int i = 0; i < arrList.size(); i++)	{
    		for(int j = i+1; j < arrList.size(); j++) {
    			if(arrList.get(i) == arrList.get(j)) {
    				count++;
    				arrList.remove(j);
    				j--;
    			}
    		}
    		pairs += count/2;
    		count = 1;
    	}
    	return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println("Pairs of socks = " + result);
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

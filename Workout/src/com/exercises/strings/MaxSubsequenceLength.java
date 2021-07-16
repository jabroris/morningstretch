package com.exercises.strings;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



class Result2 {

    /*
     * Complete the 'maxSubsequenceLength' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxSubsequenceLength(int k, List<Integer> arr) {
    	int result = 0;
    	int max = 0;
    	boolean con = false;
    	for(int i = 0; i < arr.size()-1; i++)
    	{
    		if((arr.get(i)^arr.get(i+1)) == k)
    		{
    			result++;
    			if(!con)
    				con = true;
    		}
    		else
    		{
    			con = false;
    			if(result > max)
    				max = result;
    			result = 0;
    		}
    	}
    	return max;
    }
}

public class MaxSubsequenceLength {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result2.maxSubsequenceLength(k, arr);

        
        System.out.println(result);
      //  bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}

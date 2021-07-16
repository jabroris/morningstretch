package com.exercises.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'compressedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING message as parameter.
     */

    public static String compressedString(String message) {
        
        String result = "";
        char[] letters = message.toCharArray();
        int count = 1;
        
        for(int i = 0; i < letters.length-1; i++)
        {
            if(letters[i] == letters[i+1])
            {
                count++;
                if(i==0)
                	result += Character.toString(letters[i]) + count;
                else if(count>2)
                	result = result.substring(0, result.length()-1) + count;
                else
                	result += count;
                System.out.println("1. " + result);
            } 
            else
            {
                count = 1;
                if(i==0)
                {
                	result += Character.toString(letters[i]) + Character.toString(letters[i+1]);
                	System.out.println("2. " + result);
                }
                else 
                {
                	result += Character.toString(letters[i+1]);
                	System.out.println("3. " + result);
                }
                
            }
        }
        return result;
    }

}

public class CompressedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:/test.txt")));

        String message = bufferedReader.readLine();

        String result = Result.compressedString(message);

       System.out.println(result);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}




//class Result {
//
//    /*
//     * Complete the 'countSentences' function below.
//     *
//     * The function is expected to return a LONG_INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. STRING_ARRAY wordSet
//     *  2. STRING_ARRAY sentences
//     */
//
//    public static List<Long> countSentences(List<String> wordSet, List<String> sentences) {
//
//    }
//
//}
//
//
//senteces
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int wordSetCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> wordSet = IntStream.range(0, wordSetCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .collect(toList());
//
//        int sentencesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> sentences = IntStream.range(0, sentencesCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .collect(toList());
//
//        List<Long> result = Result.countSentences(wordSet, sentences);
//
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

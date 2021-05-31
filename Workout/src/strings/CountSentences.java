package strings;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Result3 {

  /*
   * Complete the 'countSentences' function below.
   *
   * The function is expected to return a LONG_INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. STRING_ARRAY wordSet
   *  2. STRING_ARRAY sentences
   */

  public static List<Long> countSentences(List<String> wordSet, List<String> sentences) {
	  List<Long> resultList = new ArrayList<Long>();
	  
	  resultList.add(sentences.stream().count());
	  
	  return resultList;
  }

}




public class CountSentences {
  public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int wordSetCount = Integer.parseInt(bufferedReader.readLine().trim());

      List<String> wordSet = IntStream.range(0, wordSetCount).mapToObj(i -> {
          try {
              return bufferedReader.readLine();
          } catch (IOException ex) {
              throw new RuntimeException(ex);
          }
      })
          .collect(toList());

      int sentencesCount = Integer.parseInt(bufferedReader.readLine().trim());

      List<String> sentences = IntStream.range(0, sentencesCount).mapToObj(i -> {
          try {
              return bufferedReader.readLine();
          } catch (IOException ex) {
              throw new RuntimeException(ex);
          }
      })
          .collect(toList());

      List<Long> result = Result3.countSentences(wordSet, sentences);

      bufferedWriter.write(
          result.stream()
              .map(Object::toString)
              .collect(joining("\n"))
          + "\n"
      );

      bufferedReader.close();
      bufferedWriter.close();
  }
}

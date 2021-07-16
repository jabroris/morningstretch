package com.exercises.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.*;

public class MostCommonWord {
	
	public static void main(String[] args)
	{
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit. the hit, also the ball it god damn ball hit hit";
		String [] banned = {"hit", "ball"};
		MostCommonWord mcw = new MostCommonWord();
		String result = mcw.mostCommonWord(paragraph.toLowerCase(), banned);
		System.out.println(result);
		result = mcw.commonWord(paragraph);
		System.out.println("result of commonWord without banning any words:  " + result);
	}
	
	public String mostCommonWord(String paragraph, String[] banned) 
	{
	  
	   String[] parArr = paragraph.toLowerCase().split("[, ?.@]+");
	   HashMap<String, Integer> hm = new HashMap<String, Integer>();
	   List<String> bannedList = Arrays.asList(banned);

	   for(int i = 0; i < parArr.length; i++)
	   {
		   if(bannedList.contains(parArr[i]))
		   {
			   continue;
		   }
		   if(hm.containsKey(parArr[i]))
		   {
			   hm.put(parArr[i], hm.get(parArr[i])+1);
		   }
		   else
		   {
			   hm.put(parArr[i], 1);
		   }
	   }

	   Set<Map.Entry<String, Integer>> set = hm.entrySet();
	   String key = "";
	   int value = 0;
	
	   for(Map.Entry<String, Integer> me : set)
	   {
		   if(me.getValue() > value)
		   {
			   value = me.getValue();
			   key = me.getKey();	        
		   }
		   System.out.println("banned key value pair: " + key + " ---" + value);
	   }
	   return key;
	}
	
	public String commonWord(String text)
	{
		Pattern pattern = Pattern.compile("[ ,.:;-]+");
		
		return pattern.splitAsStream(text)
						.map(String::toLowerCase)
						.collect(groupingBy(word -> word, counting()))
						.entrySet().stream()
						.max(Map.Entry.comparingByValue())
						.orElseThrow()
						.toString();
	} //to get a list of all common words you can watch the streams video (part 2) around the 2:10
	  //where they are talking about streaming maps
}

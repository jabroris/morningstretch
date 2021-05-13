package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostCommonWord {
	
	public static void main(String[] args)
	{
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit. the, also the ball it god damn ball";
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
		String[] textArr = text.toLowerCase().split("[, .?;:!]+");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i = 0; i < textArr.length; i++)
		{
			if(hm.containsKey(textArr[i]))
				hm.put(textArr[i], hm.get(textArr[i])+1);
			else
				hm.put(textArr[i], 1);
		}
		
		String result = "";
		int count = 0;
		Iterator<Entry<String, Integer>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<String, Integer> mapElement = it.next();
			if((int)mapElement.getValue() > count)
			{
				count = mapElement.getValue();
				result = mapElement.getKey();
			}
			System.out.println("Key value pair:  " + mapElement.getKey() + " -- " + mapElement.getValue());
		}
		return result;
	}
}

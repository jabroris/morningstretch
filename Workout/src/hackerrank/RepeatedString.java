package hackerrank;

import java.util.*;

public class RepeatedString {
	
	public static void main(String[] args) {
		String someStr = "abaaacbaabcccdbbs";
		System.out.println(someStr.length());
		long count = someStr.chars().filter(ch -> ch == 'a').count();
		int strLength = 100;
		
		int result = strLength/someStr.length();
		System.out.println(result);
		System.out.println(count);
		result *= count;
		System.out.println(result);
		int remainder = strLength%someStr.length();
		System.out.println(remainder);
		String remainStr = someStr.substring(0, remainder);
		count = remainStr.chars().filter(ch -> ch == 'a').count();
		result += count;
		System.out.println(result);
		
	}
}

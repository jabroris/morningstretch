package SEEBURGER;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CognyteMain {
	
//	static int i;
//	static int size = 20;
//	
//	
	public static void main(String[] args) {
		
//		int[] arr = new int[size];
//		for(i = 0; i < size; i++)
//			System.out.println(arr[i]);
//		
		String str = "she sells sea shells";
		String rex = "SsS";
		String replace = "X";
		
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(str);
		System.out.println(m.toString());
		String val = m.replaceAll(replace);
		System.out.println(val);
	}
	
}


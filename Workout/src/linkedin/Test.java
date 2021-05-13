package linkedin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	static int count = 0;
	public static void main(String[] args) {
		
//		List list = new ArrayList();
//		
//		list.add("hello");
//		list.add(5);
//		System.out.print(list.get(0) instanceof Object);
//		System.out.print(list.get(1) instanceof Integer);
		
//		ArrayList names = new ArrayList();
//		names.add("ivo");
//		names.add("desi");
//		names.add("gabi");
//		names.add("mati");
//		names.add("mladen");
//		names.add("friel");
//		names.add("paddy");
//		names.add("amelia");
//		names.sort(List.);
		//names = names.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		//System.out.println(names);
		
//		System.out.print("Nifty is a string ==== ");
//		System.out.println("nifty" instanceof String);
//		
//		System.out.println("apple".compareTo("banana"));
//		
//		int a = 1;
//		int b = 0;
//		int c = a/b;
		
		String a = "helloworld";
		String d = "helloworld";
		String b = a;
		String c = new String("helloworld");
		System.out.println(a==b);
		System.out.println(a==d);
		System.out.println(a.equals(c));
		System.out.println(a==c);
		
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(5);
//		list.add(4);
//		list.add(10);
//		System.out.println(list);
		
//		String message = "Hello World!";
//		String newMessage = message.substring(6, 12) + message.substring(12, 6);
//		System.out.println(newMessage);
		
	//	String message = "Hello";
	//	
	//	for(int i =0; i<message.length(); i++) {
	//		System.out.println(message.charAt(i+1));
	//	}
	//	
		
//		if(count <3) {
//			count++;
//			main(null);	
//		} else {
//			return;
//		}
//		System.out.println("Hello World!");
		
		
//		try {
//			System.out.println("A");
//			badMethod();
//			System.out.println("B");
//		} catch (Exception ex) {
//			System.out.println("C");
//		} finally {
//			System.out.println("D");
//		}
	}
	
	public static void badMethod() {
		throw new Error();
	}
}

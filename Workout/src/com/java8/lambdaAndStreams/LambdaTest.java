package com.java8.lambdaAndStreams;

interface StringFunction {
	String display(String str);
}

interface IntFunction {
	int display(int myInt, int myOtherInt);
}

class LambdaClass {
	public void calling(StringFunction sf) {
		String str = sf.display("calling of LambdaClass");
		System.out.println(str);
	}
	
	public void calling(IntFunction intf) {
		int myInt = intf.display(5, 4);
		System.out.println(myInt);
	}
}

public class LambdaTest {
	
	public static void main(String[] args) {
		
		LambdaClass lc = new LambdaClass();

		lc.calling(new StringFunction() {

			public String display(String str) {
				return str + "    anonymous...";
			}
		});
		
		
		
		lc.calling((String str) -> {
			return str + " ---- another try to be anonymous";
		});
		
		lc.calling((i,j) -> {
			return i+j;
		});
		
	}
	
	
	
	
	
//	public static void printFormatted(String str, StringFunction format) {
//		String result = format.display(str);
//		System.out.println(result);
//	}
	
}

package com.exercises.numbers;

public class FinalTest {
	static int test;
    static boolean foo()
    {
        test++;
        return true;
    }

    public static void main(String[] args)
    {
        test = 0; 
        if ((foo() | foo()) || foo()) {
        	System.out.println(test);
        	test++; 
        }
        System.out.println(test); 
    }
}

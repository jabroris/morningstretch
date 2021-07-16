package com.exercise.arrays;

public class ArrPointers {
	
	int i[] = { 0 };

    public static void main(String args[]) {
        int i[] = { 1 };
        alter(i);
        System.out.println(i[0]);
        
        boolean a = false;
        boolean b = true;
        
        if (a) {
            System.out.println("A");
        } else if (a && b) {
            System.out.println("A && B");
        } else {
            if (!b) {
                System.out.println("!B");
            } else {
                System.out.println("None");
            }
        }
    }

    public static void alter(int i[]) {
        int j[] = { 2 };
        System.out.println(i[0]);
        i = j;
        System.out.println(i[0]);
    }
}

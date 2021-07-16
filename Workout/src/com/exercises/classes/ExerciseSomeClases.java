package com.exercises.classes;

public class ExerciseSomeClases {
	
	public static void main(String[] args) {
        class Tutorial {
            public String name;

            public Tutorial(String tutorial) {
                name = tutorial;
            }
        }

        Object obj = new Tutorial("Java Quiz");
        Tutorial tutorial = (Tutorial) obj;
        System.out.println(tutorial.name);
    }
}

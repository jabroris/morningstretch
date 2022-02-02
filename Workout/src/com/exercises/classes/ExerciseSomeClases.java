package com.exercises.classes;

public class ExerciseSomeClases {
	
	public static void main(String[] args) {
        

        Object obj = new Tutorial("JAVA Quiz");
        Tutorial tutorial = (Tutorial) obj;
        System.out.println(tutorial.name);
    }
}

class Tutorial {
    public String name;

    public Tutorial(String tutorial) {
        name = tutorial;
    }
}

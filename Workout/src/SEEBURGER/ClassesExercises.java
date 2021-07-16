package SEEBURGER;

public class ClassesExercises {
	
	    public int index = 1;
	}

class App extends ClassesExercises {

    public App(int index) {
        index = index;
    }

    public static void main(String args[]) {
        App myApp = new App(10);
        System.out.println(myApp.index);
        
        
    }
}


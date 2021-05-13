package SEEBURGER;


public class AnimalMain {
	public static void main(String[] args) {
		Animal[] allAnimals = new Animal[3];
		
		Animal cat = new Cat(3, "Puss", 'm');		
		Animal dog = new Dog(6, "Bruno", 'm');
		Animal frog = new Frog(1, "Mrs Green", 'f');
		
		allAnimals[0] = cat;
		allAnimals[1] = dog;
		allAnimals[2] = frog;
		
		for(Animal a : allAnimals)
		{
			System.out.println(a);
		}
	
	}
}

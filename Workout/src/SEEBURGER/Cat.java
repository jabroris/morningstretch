package SEEBURGER;

public class Cat extends Animal{
	
	public Cat(int age, String name, char gender)
	{
		super(age, name, gender);
	}

	public String sound() 
	{
		return "Meow";
	}
}

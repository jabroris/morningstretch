package SEEBURGER;

public class Dog extends Animal{
	
	public Dog(int age, String name, char gender)
	{
		super(age, name, gender);
	}

	@Override
	public String sound() 
	{
		return "Woof";
	}
	
	
}

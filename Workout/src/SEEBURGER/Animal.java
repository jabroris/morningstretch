package SEEBURGER;

public abstract class Animal {
	int age;
	String name;
	char gender;
	
	public Animal()
	{
		
	}
	
	public Animal(int age, String name, char gender)
	{
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	public abstract String sound();
	
	public String toString()
	{
		return "Name: " + name + "\nAge: " + age + "\nSound: " + sound();
	}
}

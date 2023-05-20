package sam;
import java.io.*;
class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
public class singlechilddemo2 
{
	public static void main(String arg[])
	{
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		
	}

}

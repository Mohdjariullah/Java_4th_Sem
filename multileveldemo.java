package sam;
class Animal2
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Barking..");
	}
}
class Babydog extends Dog2
{
	void weep()
	{
		System.out.println("Weeping..");
	}
}
public class multileveldemo {
	public static void main(String arg[])
	{
		Babydog b = new Babydog();
		b.eat();
		b.bark();
		b.weep();
		
	}

}
//      |A|
//       |
//      |B|		MultiLevel
//       |
//      |C|
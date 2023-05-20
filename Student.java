package sam;

public class Student 
{
	int regno;
	String name;
	public void getdata(int r, String n)
	{
		regno=r;
		name=n;
	}
	public void putdata()
	{
		System.out.println("Regno= "+regno);
		System.out.println("Name= "+name);
	} 
	  
} 
 
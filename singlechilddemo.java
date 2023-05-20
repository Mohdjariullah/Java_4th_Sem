package sam;
import java.io.*;
class parent
{
	int m;
	void get_m(int m)
	{
		this.m=m;
	}
	void display_m()
	{
		System.out.println("This is from parent : m ="+m);
	}
}
class child1 extends parent
{
	int n;
	void get_n(int n)
	{
		this.n=n;
	}
	void display_n()
	{
		System.out.println("This is from Child : n ="+n);
	}
}
public class singlechilddemo {
	public static void main(String arg[])
	{
		child1 c = new child1();
		c.get_m(10);
		c.get_n(20);
		c.display_m();
		c.display_n();
	}

}

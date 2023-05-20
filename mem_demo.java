package sam;

public class mem_demo {
	String msg="hi";
	void display1(String m1)
	{
		System.out.println("Message m1:"+m1);
		display2(msg);
		System.out.println("End of display1");
	}
	void display2(String m2)
	{
		System.out.println("Message m2:"+m2);
		System.out.println("End of display2");
	}
	public static void main(String arg[])
	{
		mem_demo mem1=new mem_demo();
		mem1.display1("Gpt");
	}
}

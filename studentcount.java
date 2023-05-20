
public class studentcount {
	String regno;
	String name;
	static int count=0;
	static void increment()
	{
		count++;
	}
	

public static void main(String a[]){
studentcount s1=new studentcount();
studentcount.increment();
studentcount s2=new studentcount();
studentcount.increment();
studentcount s3=new studentcount();
studentcount.increment();
System.out.println("number of objects created is :"+studentcount.count);
}
}

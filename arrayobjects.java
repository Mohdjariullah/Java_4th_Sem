package sam;
import java.io.DataInputStream;
import sam.arrayobjects.student;

class Student1{
	String name,regno;
	void getdata(String n,String r)
	{
		name=n;
		regno=r;
	}
	void putdata()
	{
		System.out.println("name:"+name);
		System.out.println("regno:"+regno);
	}
}
public class arrayobjects
{
	public class student extends Student {

	}

	public static void main(String arg[])
	{
		Student1 s[]=new Student1[4];
		for(int i=0;i<4;i++)
		{
			s[i]=new Student1();
		}
		for(int i=0;i<4;i++)
		{
			String n,r;
			try
			{
				DataInputStream ds=new
						DataInputStream(System.in);
				System.out.println("enter object"+(i+1)+"details");
				System.out.println("name:");
				n=ds.readLine();
				System.out.println("regno:");
				r=ds.readLine();
				s[i].getdata(n,r);
			}
			catch(Exception e){}
		}
		System.out.println("entered students details are as follows:");
		for(int i=0;i<4;i++)
		{
			s[i].putdata();
		}
	}
}


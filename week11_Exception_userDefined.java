package sam;
import java.lang.Exception; 
import java.lang.*; 
import java.lang.Exception; 
import java.io.DataInputStream; 
public class week11_Exception_userDefined 
{
	MyException(String message) 
	{ 
	super(message); 
	} 
	} 
	class userdef 
	{ 
	public static void main(String a[]) 
	{ 
	int age; 
	DataInputStream ds=new DataInputStream(System.in); 
	try 
	{ 
		System.out.println("Enter the age (above 15 and below 25) :"); 
		age=Integer.parseInt(ds.readLine()); 
		if(age<15 || age> 25) 
		{ 
		throw new MyException("Number not in range"); 
		} 
		System.out.println(" the number is :" +age); 
		} 
	catch(Exception e){ System.out.println(e); } 
	} 

	}


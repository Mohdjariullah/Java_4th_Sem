import java.io.*;
public class autobox_unbox {
public static void main(String arg[])
{
	int i=20;
	Integer I=i;
	Integer I2=new Integer(10);
	int i2=I2;
	System.out.println("Value int i="+i);
	System.out.println("Value Integer I="+I);
	System.out.println("Value Integer I2="+I2);
	System.out.println("Value Integer i2="+i2);
	
	Character C='s';
	char ch=C;
	System.out.println("Value Character C="+C);
	System.out.println("Value char ch="+ch);
	Double D=1.2;
	double d=D;
	System.out.println("Value Double D="+D);
	System.out.println("Value double ch="+d);
	
	
	
}
}

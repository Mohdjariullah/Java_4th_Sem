package sam;
import java.util.Scanner;
public class arraydemo 
{
	public static void main(String arg[])
	{
		int a[]=new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			System.out.print("Enter Array Element "+(i+1)+" :");
			a[i]=sc.nextInt();
			
		}
		System.out.println("Elements are :");
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	}
}

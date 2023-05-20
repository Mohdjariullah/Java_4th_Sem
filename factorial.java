package sam;
import java.util.Scanner;
public class factorial 
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to check for Factorial: ");
		int n=sc.nextInt();
		int factorial=1;
		if(n==0)
		{
			System.out.println("Factorial of 0 is 1");
		}
		else
			for(int i=1;i<=n;i++)
			{
				 factorial=factorial*i;
			}
		System.out.println("Factorial of "+n+" is "+factorial);
	}
}

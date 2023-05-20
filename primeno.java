package sam;
import java.util.Scanner;
public class primeno 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check for prime no :");
		int num=sc.nextInt();
		boolean a=true;
		
		for (int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				a=false;
				break;
				
			}
		}
		if(a){
			System.out.println(num+" is a prime number");
		}
		else
			System.out.println(num+ "is not a prime number");
		
	}
}

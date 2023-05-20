package sam;
import java.util.Scanner;
public class verifycode 
{
	public static void main(String arg[])
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Regno to check for college code,branch & Batch year :");
		String regno=sc.next();
		String collegecode=regno.substring(0,3);
		
		if(collegecode.equals("109"))
		{
			System.out.println("This is GPT Kalaburgi code: "+collegecode);
			String branch=regno.substring(3, 5);
			if(branch.equalsIgnoreCase("IS") || branch.equalsIgnoreCase("CS") || branch.equalsIgnoreCase("CE") || branch.equalsIgnoreCase("EC") || branch.equalsIgnoreCase("EE") || branch.equalsIgnoreCase("ME"))
			{
				System.out.println("You are from "+branch+" Branch");

				String last5didgits=regno.substring(5,10);
				if(last5didgits.matches("[0-9]+"))
				{
					System.out.println("Last 5 digits are  "+last5didgits);
				}
				else
				{
					System.out.println("This is not a last 5 digits");
				}
				
			}
			
			else
			{
				System.out.println("This is not a Valid branch of gpt, glb!");
			}
		
		}
		else
		{			
			System.out.println("This is not a Valid GPT kalaburgi code!");
		}
		}//Try Closed
		catch(Exception e)
		{
			
		}
	}
}




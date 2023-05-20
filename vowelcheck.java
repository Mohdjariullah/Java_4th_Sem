package sam;
import java.util.Scanner;
public class vowelcheck 
{
	public static void main(String arg[])
	{
		while(true)
		{
			System.out.println("Enter a character to check for vowel:");
			try
			{
				Scanner sc = new Scanner(System.in);
				String ch= sc.next();
				switch(ch)
				{
				case"a":System.out.println("'a' is a vowel");
				break;
				case"e":System.out.println("'e' is a vowel");
				break;
				case"i":System.out.println("'i' is a vowel");
				break;
				case"o":System.out.println("'o' is a vowel");
				break;
				case"u":System.out.println("'u' is a vowel");
				break;
				default:System.out.println("The given character is not a vowel");
				}
			}
			finally{
				
				
			}
			
		}
	}

}

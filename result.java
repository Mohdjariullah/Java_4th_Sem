package sam;
import java.util.Scanner;
public class result{
public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	try
	{
		while(true)
		{
			System.out.print("Enter your percentage: ");
			int per=sc.nextInt();
			if(per>0 & per<35){
				System.out.println("Fail");
			}
			else if(per>35 & per<60){
				System.out.println("Second Class");
			}
			else if(per>60 & per<75){
				System.out.println("First Class");
			}
			else if(per>75 & per<100){
				System.out.println("Distinction");
			}
	}
	}
	finally{
		
	}
	}
}


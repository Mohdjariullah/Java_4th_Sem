package sam;
import java.util.Scanner;
public class deleteit {
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		while(true){
		System.out.print("Enter your age to check for voting: ");
		int age=sc.nextInt();
		try{
			if(age>=18)
				System.out.println("you can vote!");
			else
				System.out.println("you cannot vote, you are minor");
		}
		catch(Exception e){
			
		}
		}
	}

}

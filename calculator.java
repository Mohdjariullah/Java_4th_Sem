package sam;
import java.util.Scanner;
public class calculator{
	public static void main(String[] args) {
		Double a,b,c=0.0;
		String operator;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("enter a first number");
			a=sc.nextDouble();
			System.out.println("enter a second number");
			b=sc.nextDouble();
			System.out.println("enter a operator");
			operator=sc.next();
			switch (operator)
			{
			case "+": c=a+b;
			break;
			case "-": c=a-b;
			break;                            
default:System.out.println("invalid operator");
			}
			System.out.println(c);
		}catch(Exception e){
		}
	}
}		
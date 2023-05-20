package sam;
import java.util.Scanner;
public class array7demo {
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		
		int a[]=new int [5];
		for(int i =0;i<=4;i++){
			System.out.print("Enter array element "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=4;i++){
			System.out.println(a[i]);
		}
		/*int a[][]=new int[2][3];
		for(int i=0;i<=2;i++){
			for(int j=0;j<=3;j++){
				a[i][j]=2;	
			}
		}
		//Printing
		for(int i=0;i<=2;i++){
			for(int j=0;j<=3;j++){
				System.out.println(a[i][j]);
			}
		}*/
	}
}

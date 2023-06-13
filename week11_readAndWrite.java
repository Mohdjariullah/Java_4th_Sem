package sam;
import java.io.File; 
import java.io.FileWriter; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.Scanner; 
public class week11_readAndWrite
{
	public static void main(String arg[])
	{
		try
		{
			File f1 = new File("E:Input.txt");
			FileWriter f2=  new FileWriter("E:Output.txt");
			Scanner s1 = new Scanner(f1);//input stream to read data from f1 
			 System.out.println("The Content of the Input file is :"); 
			 while (s1.hasNextLine()) { 
				 String value=s1.nextLine(); 
				 System.out.println( value); 
				 f2.write(value); 
				 f2.write("\n"); 

		}
			 System.out.println("The Content is successfully writtten on to Output File"); 
			 f1.close(); 
			 f2.close(); 
			 s1.close(); 
	}
		catch (Exception e) { 
			 System.out.println("Unexcpected error occurred!"); 
			e.printStackTrace(); 
			 } 
			catch (Exception e) { 
			 System.out.println("Unexpected error occurred"); 
			 }	
}
}

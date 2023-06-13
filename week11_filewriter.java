package sam;
import java.io.FileWriter; 
// Importing the IOException class for handling errors 
import java.io.IOException; 
public class week11_filewriter
{
	public static void main(String arg[])
	{
		try
		{
			FileWriter fwrite = new FileWriter("E:Input.txt");
			// writing the content into the FileOperationExample.txt file 
			fwrite.write("Hi...Welcome To Government Polytechnic, Kalaburgi");
			//closing the stream
			fwrite.close();
			System.out.println("Content is Sucessfully written on the File");
		}
		catch(IOException e)
		{
			System.out.println("Unexpected Error Occured");
			e.printStackTrace();
		}
	}
}

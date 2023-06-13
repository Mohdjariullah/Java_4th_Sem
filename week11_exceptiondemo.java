package sam;
import java.io.File;
import java.io.FileNotFoundException;
public class week11_exceptiondemo {
	public static void main(String args[]){
		try{
			File f1 = new File("E:input.txt");  // throws checked exception if file not exist and need to be handled
			System.out.println("The name of this file is :"+f1.getName());
		}//try close
		catch(FileNotFoundException e){
			System.out.println("File was not Found.");
		}
	}
		
		String input=null;
		input.length(); // throws an unchecked exceptionNullPointerException No need to handle
	}



package sam;
import java.io.File;
//Importing the IOException class for handling errors 
import java.io.IOException; 
public class week11_ToCreateFIle {
		public static void main(String arg[]){
			try{
				//creating a File
				File f1 = new File("E:Input.txt");
				if(f1.createNewFile()){
					System.out.println("File "+f1.getName()+"Created Successfully");
				}
				else{
					System.out.println("File already exists in the Directory");
				}
			}//try close
		catch (IOException exception) { 
				 System.out.println("An unexpected error is occurred."); 
				 exception.printStackTrace(); 
		}
}
}

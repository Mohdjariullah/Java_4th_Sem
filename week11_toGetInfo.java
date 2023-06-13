package sam;
import java.io.File;
public class week11_toGetInfo 
{
		void fileinfo(File f1)
		{
			System.out.println("The name of the file is:"+f1.getName());
			System.out.println("The Absolute path of the file is:"+f1.getAbsolutePath());
			System.out.println("Is the File writable? :"+f1.canWrite());
			System.out.println("Is the File Readable? :"+f1.canRead());
			System.out.println("The size of the File in bytes is :"+f1.length());
		}
		public static void main(String arg[])
		{
			week11_toGetInfo p = new week11_toGetInfo();
			File f1 = new File("E:Week11_FileInfo.txt");
			if(f1.exists())
			{
				p.fileinfo(f1);
			}
			else
			{
				System.out.println("The file does not exist");
				try
				{
					if(f1.createNewFile())
					{
						System.out.println("File Created");
						p.fileinfo(f1);
					}
				}
				catch(Exception e)
				{
					System.out.println("Error");
				}
			}
		}
}

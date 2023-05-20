class student 
{
	String regno;
	String name;
	int sem;


void getdata(String r, String n, int s)
{
	regno=r;
	name=n;
	sem=s;
	
}
void putdata()
{
	System.out.println("Regno="+regno);
	System.out.println("Name="+name);
	System.out.println("Sem="+sem);
	
}
 
}
class studentdemo
{
	public static void main(String arr[])
	
{
	student S1,S2;
	S1=new student();
	S2=new student();
	S1.getdata("109Is21013","Sami",4);
	S2.getdata("109is21014","Mohiuddin",4);
	S1.putdata();
	S2.putdata();
	
}
}
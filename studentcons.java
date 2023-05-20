
public class studentcons {
String regno;
int sem;
studentcons(String r,int s)
{
	regno=r;
	sem=s;
	
}
studentcons(studentcons s1)
{
this.regno=s1.regno;
this.sem=s1.sem;
}
studentcons()
{
	
}
void display()
{
	System.out.println("Regno="+regno);
	System.out.println("Sem="+sem);
	
}
public static void main(String args[])
{
	studentcons s1= new studentcons("109Is21013",4);
	studentcons s2= new studentcons(s1);//copy constructor
	studentcons s3= new studentcons();
	s1.display();
	s2.display();
	s3.display();
}
}


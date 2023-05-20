package sam;

public class Stringdemo 
{
	public static void main(String arg[])
	{
		String s1= new String("gpt gulbarga");
		String s2= new String("GPT GULBARGA");
		System.out.println("This is String s1 :"+s1);
		System.out.println("This is String s2 :"+s2);
		System.out.println("Length of String s1 :"+s1.length());
		System.out.println("Index of 'r' in String s1 :"+s1.indexOf('r'));
		System.out.println("String s1 Converting to UpperCase :"+s1.toUpperCase());
		System.out.println("String s2 Converting to LowerCase :"+s2.toLowerCase());
		System.out.println("String s1 equals to String s2 :"+s1.equals(s2));
		System.out.println("String s1 equalsIgnoreCase to String s2 :"+s1.equalsIgnoreCase(s2));
		int result =s1.compareTo(s2);
		if(result==0)
			System.out.println("Both are equal");
		else if(result>0)
			System.out.println(s1+" is  Greater than "+ s2);
		else
			System.out.println(s1+" is  Lesser than "+ s2);
		System.out.println("Character at 6th Index in "+s1+" is :"+s1.charAt(6));
		System.out.println("Substring from 4 to 12 in s1 is :"+s1.substring(4,12));
		System.out.println("Replacing 'g' with 'a' in s1 :"+s1.replace('g','a'));
		String s3 =" 	hi    		Welcome 			sam ";
		String ab=s3.trim();
		System.out.println("After Triming String s3 :"+ab);
		System.out.println("After concatenation :"+s1.concat(s2));
		
	}
}

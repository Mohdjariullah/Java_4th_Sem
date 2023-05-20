package sam;

import java.lang.*; 
class dynamicb 
{ 
void display(String msg) 
{ 
System.out.println("Welcome to "+msg); 
} 
} 
class child extends dynamicb															 
{ 
void display(String msg) 
{ 
System.out.println("Heartily Welcome to "+msg); 
} 
public static void main(String arg[]) 
{ 
child obj=new child(); 
obj.display("GPT Kalaburagi"); 
} 
} 
//   “
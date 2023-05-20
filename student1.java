

	class student18 
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

	class studentdemo1
	{
		public static void main(String arg[])
		
	{
		student18 S1,S2;
		S1=new student18();
		S2=new student18();
		S1.getdata("109Is21013","Sami",2);
		S2.getdata("109is21014","gdeg",5);
		S1.putdata();
		S2.putdata();
		
	}
	}


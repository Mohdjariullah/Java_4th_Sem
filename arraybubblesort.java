package sam;

public class arraybubblesort {
	public static void main(String arg[]){
		String[] countries={"India","America","Jamaica","Denmark","Srilanka"};
		int size=countries.length;
		
		for(int i=0;i<size-1;i++){
			for (int j=i+1; j<countries.length; j++){
				if(countries[i].compareTo(countries[j])>0){
					String temp=countries[i];
					countries[i]=countries[j];
					countries[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array is :");
		for(int i=0;i<size;i++)
			System.out.println(countries[i]);
	}

}

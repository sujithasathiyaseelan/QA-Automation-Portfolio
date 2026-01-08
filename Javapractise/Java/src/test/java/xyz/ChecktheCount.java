package xyz;

public class ChecktheCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd@123";
		int n=s.length();
		int Alphanumeric=0;;
		int Specialcharacters=0;
		int numbers=0;
		
		
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
		
		
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='z'))
				{
			Alphanumeric++;
			
		//System.out.println("The value of Alpha =:"+Alpha);
	}
	
		else if (ch >='0' && ch <='9')
		{
			numbers++;
		}
		else 
		{
		Specialcharacters++;
		}}
//			

		
		System.out.println ("The count of Alphanumeric ="+Alphanumeric);
		System.out.println ("The count of numbers ="+numbers);
		System.out.println ("The count of Specialcharacters ="+Specialcharacters);
		
			
		
		
		
		
		
		

	

}}

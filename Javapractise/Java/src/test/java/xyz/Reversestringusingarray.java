package xyz;

public class Reversestringusingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Selenium";
		int n= s.length();
		String v="";
		
		for(int i=n-1;i>=0;i--)
			
		{
			v = v+ s.charAt(i);
		}
		System.out.println(v);

	}

}
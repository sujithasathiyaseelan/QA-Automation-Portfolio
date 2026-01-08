

public class Reversestringusingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Selenium";
		int n= s.length();
		String v="";//to store the reverse characters 
		
		for(int i=n-1;i>=0;i--)//i=7,7 is less than =0, then it will append and store in v
			
		{
			v = v+ s.charAt(i);
		}
		System.out.println(v);

	}

}
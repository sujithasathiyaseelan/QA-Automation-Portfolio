

public class Palindromeusingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="race";
int n=s.length();
String v="";

for(int i=n-1;i>=0;i--) {
	v= v+s.charAt(i);
}
if(s.equals(v)) {
	System.out.println("The entered string is a palindrome");
}
else
{ System.out.println("The enetered string is not a palindrome");
	
	
}

	}}



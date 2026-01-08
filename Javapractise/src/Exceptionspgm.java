
public class Exceptionspgm {//exception handling 
	public void m() {
		int w=3;
		int r=5;
		int f=w*r;
		System.out.println(f);
	}
public void d() {
	int a=2;
	int b=0;
	int c=a/b;
	
}
public void e() {
	System.out.println("exception handling");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exceptionspgm e=new Exceptionspgm();
e.m();

try {
	e.d();

}	
//catch(Exception e1) {
catch(ArithmeticException e1) {
	//System.out.println(e1.getMessage());
}
finally {
	System.out.println("ERROR");
}
e.e();
}}

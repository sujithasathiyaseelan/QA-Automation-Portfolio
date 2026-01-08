//Constructor

public class Test2 {
	String name;
	String role;
	String teamName;
	int c;
	public void employee_info(String empname,String emprole,String empteamName)//method to assign employee details
	{
		name=empname;
		role=emprole;
		teamName=empteamName;
		
		
//  this.name =  name;//The left side (this.name) refers to the instance variable, while the right side (name) refers to the method parameter.
//  this.role=role;
//  this.teamName=teamName;
	}
	public void Display() {
	System.out.println("Employee name =" + name );
	System.out.println("Employee Role = "+role );
	System.out.println("Team ="+teamName );
   }
	Test2()//Constructor
	{
		int a=10;
		int b=20;
		  c = a+b;
		
	}
	public void addition() {
		System.out.println("Sum(a+b)="+ c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 T=new Test2();
T.employee_info("Beth", "Dev", "TPERT");
T.Display();
//T.addition();

	}

}
//public class example {
//String book;
//String Author;
// public void bookdetails(String bookname, String Writer) {
//	 book=bookname;
//	 Author=Writer;
//}
// 
//example(){
//	System.out.println("Book details"); 
//	}
//
//
//		
//
//
//	public static void main(String[] args) {
//		
//		// TODO Auto-generated method stub
//		example e= new example();
//		
//		e.bookdetails("Dragon","lee");
//		
//}}
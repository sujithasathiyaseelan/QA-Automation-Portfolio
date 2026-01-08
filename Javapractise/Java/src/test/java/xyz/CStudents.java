package xyz;
import java.util.Scanner;

public class CStudents {
	String Name;
	String Dept;
	int id;
	int batch;
	 
	public void GetStudentDetails( )
 {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	         Name = scanner.nextLine();
		
		
		//Dept=department;
		//id=Studentid;
		//batch=Studentbatch;

	}

	public void PrintStudentDetails()
	{
		System.out.println("Name of the Student ="+Name);
		System.out.println("Student Department ="+Dept);
		System.out.println("Student Batch ="+batch);
	}
	
 public void StudentPersonal_info() {
	String Address="123,east geddes ln,parker,co-80134";
	String Email="abc@gmail.com";
	int Mobileno=+919723455;
	System.out.println("Student Address ="+Address);
	//System.out.println("Student Email ="+ Email);
	//System.out.println("Student MobileNo="+Mobileno);
}

CStudents(){
	int totalSDinclass =56;
	System.out.println("Total Students ="+totalSDinclass);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStudents CS=new CStudents();
		CS.GetStudentDetails();
		
		
		CS.PrintStudentDetails();
		
		//CStudents CS1=new CStudents();
		
		
		

	}

}

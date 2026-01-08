package xyz;//Polymorphism 

public class HSstudents {
	


	String name;
	String Department;
	int id;
	
	
	public void SDlist() {
		
	}
public void SDlist(String SDname,int SDid,String SDDepartment) {
	name=SDname;
	id=SDid;
	Department=SDDepartment;
	System.out.println("Name="+name);
	System.out.println("ID="+id);
	System.out.println("Dept ="+Department);
	
	}
public void SDlist(String SDEmail) {
	
	System.out.println("Email ="+ SDEmail);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HSstudents HS= new HSstudents();
HS.SDlist("Ema", 44, "ECE");
HSstudents HS1=new HSstudents();
HS.SDlist( "eva@gmail.com");
	}
	}


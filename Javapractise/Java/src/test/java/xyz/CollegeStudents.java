package xyz;//Static and Fixed Keyword

public class CollegeStudents {
	
	static String CollegeName="MIT";
	final public int Year=2012;
	final public int Total=64;
	
	   void  Studentinfo(String  Name ,String Dept,int rollno) {
		System.out.println("Student Name:"+Name);
		System.out.println("Student Department:"+Dept);
		System.out.println("Student Roll no:"+rollno);
		System.out.println("College Name:"+CollegeName);
		System.out.println("Year:"+Year); 
		 System.out.println("Total:"+Total);
		
		
	}
	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeStudents CS= new CollegeStudents();
		//CS.CollegeName="SVCE";
		CS.Studentinfo("EVA","ECE", 1);

	}

}

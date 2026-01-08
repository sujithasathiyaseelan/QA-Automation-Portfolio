public class StudentC extends StudentP {
	public void test23() {
		 String name="JACK";
		    int grade=3;
		     int classTotal=63;
		
	}
	public void getstudentinfo() {
		System.out.println("Child Display:");
        System.out.println("Name = " + name);
        System.out.println("Grade = " + grade);
        System.out.println("Class Total = " + classTotal);
	
	
	 System.out.println("Parent Display");
     System.out.println("Name       : " + super.name);    // Parent value
     System.out.println("Grade      : " + super.grade);
     System.out.println("Class Total: " + super.classTotal);}
        
      
	public static void main(String[] args) {
		StudentC A=new StudentC();
		A.test23();
		A.getstudentinfo();
		
		
		
	}
}

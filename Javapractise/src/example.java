
public class example{//Method Overload
int number;
String Studentname;
String Department;


public void getinfo(int no, String name) {
	this.number=no;
	this.Studentname=name;
	
}
public void getinfo(String dept) {
	this.Department=dept;
}
public void getinfo() {
    System.out.println("Student Name = " + Studentname);
    System.out.println("Student Number = " + number);
    System.out.println("Student Department = " + Department);
}

public static void main(String[] args) {
    example e = new example();
    e.getinfo("ECE");
    e.getinfo(12, "David");
    e.getinfo(); // display all info

		
}}
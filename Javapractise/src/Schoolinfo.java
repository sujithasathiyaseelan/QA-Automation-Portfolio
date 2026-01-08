
public class Schoolinfo {//Encapsulation
private String Studentname;
public String getStudentname() {
	return Studentname;
}

public void setStudentname(String studentname) {
	Studentname = studentname;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

private int rollno;
public void display() {
	System.out.println("Name="+Studentname);
	System.out.println("Rollno="+rollno);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schoolinfo S=new Schoolinfo();
		S.setStudentname("Jane");//use set to set values to the variables 
		S.setRollno(23);
		S.display();
	}

}

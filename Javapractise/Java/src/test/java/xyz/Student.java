package xyz;//Static and Final Keyword

import java.util.Scanner;

//Static

public class Student {
String Name;
	static String SchoolName="EWARTS";
	private int grade;
	public int score;
	final public int year = 2025;
		 public void StudentName() 
		 {
		 Scanner S= new Scanner(System.in);
		 System.out.println("Enter the Student Name");
		 Name=S.nextLine();
		 grade = 10;
		 score = 23;
		 }
		 
		 public void Display(int rollno, int Grade) 
		 {
		 
			System.out.println("Students SchoolName ="+SchoolName);
			System.out.println("Student roll no="+rollno);
			System.out.println("Student Grade ="+Grade);
			System.out.println("Year of Pass="+year);
			grade = 50;
			score = 2324;
			
			
		 }
	
	
	public static void main(String[] args) {
////		// TODO Auto-generated method stub
	Student SD=new Student();
	SD.StudentName();
	SD.Display(23, 4);
	}
	
}


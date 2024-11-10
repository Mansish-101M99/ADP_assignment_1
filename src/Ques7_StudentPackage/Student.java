package Ques7_StudentPackage;

public class Student {
	protected String name;
	protected int rollno;
	
	public void inputDetails(String nm, int rln) { 
		this.name = nm;
		this.rollno = rln; 
	}
	
	public void showDetails() {
		System.out.println("Student name : " + this.name);
		System.out.println("Student roll no : " + this.rollno); 
	}
}

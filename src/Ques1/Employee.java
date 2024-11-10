package Ques1;

public class Employee {
	String name;
	int age;
	double salary;
	
	public void setData(String nm, int a, double sal) {
		this.name = nm;
		this.age = a;
		this.salary = sal;
	} 
	
	public void displayData() {
		System.out.println("Employee name : " + this.name); 
		System.out.println("Employee age : " + this.age);
		System.out.println("Employee salary : " + this.salary);
	}
}

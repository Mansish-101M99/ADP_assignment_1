package Ques4;

public class HR extends Employee {
	int eID;
	double salary;
	
	public HR(String nm, int a, int eid, double sal) {
		super(nm, a);
		this.eID = eid;
		this.salary = sal;
	}
	
	public void displayDetails() {
		System.out.println("Employee name : " + getName());
		System.out.println("Employee age : " + getAge());
		System.out.println("Employee ID : " + this.eID);
		System.out.println("Employee salary : " + this.salary);
	}
}

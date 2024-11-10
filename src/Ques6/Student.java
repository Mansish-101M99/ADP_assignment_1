package Ques6;

public class Student implements DetailInfo {
	static int maxcount;
	protected String name;
	
	public Student(String nm) {
		this.name = nm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	@Override
	public int count() {
		return name.length(); 
	}
	
	@Override
	public void display() { 
		System.out.println("Name of the student :- " + getName());
	}
}

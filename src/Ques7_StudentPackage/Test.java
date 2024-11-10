package Ques7_StudentPackage;

public class Test extends Student {
	protected int mark1;
	protected int mark2;
	
	public void inputDetails(int m1, int m2) {
		// super.inputDetails(name, age); 
		this.mark1 = m1;
		this.mark2 = m2;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Marks of subject 1 : " + this.mark1);
		System.out.println("Marks of subject 2 : " + this.mark2);
	}
}

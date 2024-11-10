package Ques6;
import java.util.*;

public class Qs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name - "); 
		String nam = sc.nextLine();
		Student std = new Student(nam);
		
		std.display();
		System.out.println("Total characters in the name string = " + std.count()); 
	}

}

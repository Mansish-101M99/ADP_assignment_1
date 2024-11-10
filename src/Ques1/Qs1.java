package Ques1;

import java.util.*; 

public class Qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.name = "Joseph";
		e1.age = 25;
		e1.salary = 65784.50;
		
		System.out.println("Enter your name : ");
		String na = sc.nextLine();
		System.out.println("Enter your age : ");
		int ag = sc.nextInt();
		System.out.println("Enter your salary : ");
		double sal = sc.nextDouble();
		
		e2.setData(na, ag, sal);
		e1.displayData();
		e2.displayData();
		
		sc.close();
	}

}

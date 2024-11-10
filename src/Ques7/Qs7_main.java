package Ques7;
import java.util.*;

import Ques7_StudentPackage.Test;
import Ques7_SportsPackage.Sports;

public class Qs7_main extends Test implements Sports {
	int totalMarks = 0, totalScore = 0;
	
	public void getGrandTotal(int score1, int score2) {
		totalMarks = mark1 + mark2;
		totalScore = score1 + score2;
		showDetails();
		System.out.println("Total marks (mark1 + mark2) = " + totalMarks);
		System.out.println("Total score (score1 + score2) = " + totalScore);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name - ");
		String nam = sc.nextLine();
		System.out.println("Enter student roll no. - ");
		int rol = sc.nextInt();
		
		System.out.println("Enter marks for subjects (mark1 and mark2) : ");
		int m1 = sc.nextInt(), m2 = sc.nextInt();
		System.out.println("Enter scores (Score1 and score2) : ");
		int scr1 = sc.nextInt(), scr2 = sc.nextInt();
		
		Qs7_main stud = new Qs7_main();
		stud.inputDetails(nam, rol);
		stud.inputDetails(m1, m2);
		stud.getGrandTotal(scr1, scr2);
		
		sc.close();
	}
}

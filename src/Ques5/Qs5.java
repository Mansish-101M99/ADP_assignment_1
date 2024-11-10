package Ques5;

public class Qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CSE cseStud = new CSE(89.65, 93.73, 84.79);
		NonCSE nonCseStud = new NonCSE(87.19, 86.05, 89.23);
		
		System.out.println("CSE Student percentage : " + cseStud.getPercentage());
		System.out.println("NonCSE Student percentage : " + nonCseStud.getPercentage());
	}

}

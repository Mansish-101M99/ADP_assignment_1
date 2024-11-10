package Ques2;
import java.util.*;

public class Qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int prid, qnt;
		double prc, tprc = 0.0;
		Product pd[] = new Product[5];
		
		for (int i = 0; i < pd.length; i++) {
			System.out.println("Enter the product ID : ");
			prid = sc.nextInt();
			System.out.println("Enter product price : ");
			prc = sc.nextDouble();
			System.out.println("Enter product quantity : ");
			qnt = sc.nextInt();
			
			pd[i] = new Product(prid, prc, qnt); 
//			pd[i].display();
			System.out.println();
		}
		
		for (Product p: pd) {
			p.display();
			tprc += p.getTotalPrice();
		}
		System.out.println("The sum total price = " + tprc);
		sc.close();
	}

}

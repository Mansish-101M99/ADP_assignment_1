package Ques2;

public class Product {
	static double totalPrice;
	int quantity, prodid; 
	double price;
	
	public Product(int prid, double prc, int qt) {
		this.quantity = qt; 
		this.prodid = prid;
		this.price = prc;
	}
	
	public void display() {
		System.out.println("Product ID : " + this.prodid);
		System.out.println("Price of this product : " + this.price);
		System.out.println("Quantity of this product : " + this.quantity);
		System.out.println("Total price incurred = " + (this.price * this.quantity));
		
//		totalPrice += (this.price * this.quantity);
		totalPrice += getTotalPrice();
		System.out.println();
	}
	
	public double getTotalPrice() {
		return (this.price * this.quantity); 
	}
}

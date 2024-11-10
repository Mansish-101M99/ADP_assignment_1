package Ques3;

public class Deposit {
	long principal;
	int time;
	double rate, totalAmt;
	
	public Deposit() {
		this.principal = 0;
		this.rate = 0.0;
		this.time = 0;
	}
	
	public Deposit(long pri, int t, double rt) {
		this.principal = pri;
		this.rate = rt;
		this.time = t;
	}
	
	public Deposit(long pri, int t) {
		this.principal = pri;
		this.rate = 0.0;
		this.time = t;
	}
	
	public Deposit(long pri, double rt) {
		this.principal = pri;
		this.rate = rt;
		this.time = 0;
	}
	
	public double calcAmt(long pri, int t, double rt) {
		double simin = (pri * rt * t) / 100;
		totalAmt = pri + simin;
		return totalAmt; 
	}
	
	public void display() {
		System.out.println("Principal amount = " + this.principal);
		System.out.println("Annual rate = " + this.rate);
		System.out.println("Time given = " + this.time);
		System.out.println("Total amount incurred = " + this.totalAmt);
	}
	
}

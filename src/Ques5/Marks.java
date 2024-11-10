package Ques5;

public abstract class Marks {
	protected double markICP, markDSA, percentage;
	
	public Marks(double micp, double mdsa) {
		this.markICP = micp;
		this.markDSA = mdsa;
	}
	
	public abstract double getPercentage(); 
}

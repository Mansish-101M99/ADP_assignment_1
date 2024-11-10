package Ques5;

public class NonCSE extends Marks {
	protected double enggMechanics;
	
	public NonCSE(double micp, double mdsa, double engmc) {
		super(micp, mdsa);
		this.enggMechanics = engmc;
	}
	
	@Override
	public double getPercentage() {
		double pcn = ((markICP + markDSA + enggMechanics) / 300) * 100;
		return pcn; 
	}
}

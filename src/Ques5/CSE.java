package Ques5;

public class CSE extends Marks {
	protected double algoDesign;
	
	public CSE(double micp, double mdsa, double algods) {
		super(micp, mdsa); 
		this.algoDesign = algods;
	}
	
	@Override
	public double getPercentage() {
		double pcn = ((markICP + markDSA + algoDesign) / 300) * 100;
		return pcn; 
	}
}

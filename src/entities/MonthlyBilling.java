package entities;

public class MonthlyBilling {
	
	private double SP;
	private double RJ;
	private double MG;
	private double ES;
	private double others;
	
	public MonthlyBilling(double sP, double rJ, double mG, double eS, double others) {
		SP = sP;
		RJ = rJ;
		MG = mG;
		ES = eS;
		this.others = others;
	}

	public double getSP() {
		return SP;
	}

	public void setSP(double sP) {
		SP = sP;
	}

	public double getRJ() {
		return RJ;
	}

	public void setRJ(double rJ) {
		RJ = rJ;
	}

	public double getMG() {
		return MG;
	}

	public void setMG(double mG) {
		MG = mG;
	}

	public double getES() {
		return ES;
	}

	public void setES(double eS) {
		ES = eS;
	}

	public double getOthers() {
		return others;
	}

	public void setOthers(double others) {
		this.others = others;
	}
	
	public double total() {
		return SP + RJ + MG + ES + others;
	}
	
	public double percentage(double state) {
		return (state * 100) / total();
	}
}

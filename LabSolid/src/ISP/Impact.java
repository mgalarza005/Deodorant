package ISP;


public class Impact {

	public double calculateImpac(int years, double afection, double increment) {
		if(years>65) return afection*0.5;else return 0;
	}

	
}

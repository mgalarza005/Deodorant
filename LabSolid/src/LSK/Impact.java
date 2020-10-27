package LSK;


public class Impact {

	public double calculateImpact(int years, double afection, double increment) {
		if (years<10) {
			return 0;
		}
		return afection+increment;
	}
}

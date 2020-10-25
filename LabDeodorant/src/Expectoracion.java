

/**
 * @see Symptoms#EXPECTORACION
 */
public class Expectoracion extends Symptom {
	public double getProbabilityCovid19(double probability) {
		probability = 60;
		return probability;
	}
}
public class Symptoms {
	static final public int FIEBRE = 0;
	static final public int TOS_SECA = 1;
	static final public int CEFALEA = 2;
	static final public int EXPECTORACION = 3;
	// sintoma bakoitzaren larritasun indizea
	public double getSeverityIndex(int symptom) {
		double index = 0;
		switch(symptom) {
		case FIEBRE:
			index =5;
			break;
		case TOS_SECA:
			index = 4;
			break;
		case CEFALEA:
			index = 3;
			break;
		case EXPECTORACION:
			index = 2;
			break;
		}
		return index;
	}
	// sintoma bakoitzaren agerpena Covid19-an
	public double getProbabilityCovid19(int symptom) {
		double probability = 0;
		probability = getSymptomObject(symptom).getProbabilityCovid19(probability);
		return probability;
	}
	private Symptom getSymptomObject(int symptom) {
		switch (symptom) {
		case FIEBRE:
			return new Fiebre();
		case TOS_SECA:
			return new TosSeca();
		case CEFALEA:
			return new Astenia();
		case EXPECTORACION:
			return new Expectoracion();
		}
		return null;
	}
}
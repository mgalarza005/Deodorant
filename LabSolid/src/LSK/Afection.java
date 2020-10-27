package LSK;

import java.util.HashMap;
import java.util.Map;

public class Afection {
	private Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();

	public Afection(Map<Symptom, Integer> symptoms) {
		super();
		this.symptoms = symptoms;
	}

	public Map<Symptom, Integer> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(Map<Symptom, Integer> symptoms) {
		this.symptoms = symptoms;
	}
	public double calculateAfections() {
		double afection=0;
		for (Symptom s:symptoms.keySet()) {
			afection=afection+s.getSeverityIndex()*symptoms.get(s);
		}

		return afection/(symptoms.size());
	}
}

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
	Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();
	
	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c,w);
	}

	
	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		
		//calculate afection
		for (Symptom s:symptoms.keySet())
			afection=afection+s.getSeverityIndex()*symptoms.get(s);
	
		afection=afection/(symptoms.size());
		
		//calculate increment
		if (getYears()>65) increment=afection*0.5;
		
		//calculate impact
		impact=afection+increment;
		
		return impact;
	}
	int sanatedDays() {
		int max=0;
		for (Symptom s:symptoms.keySet())
			if(max<s.affectedDays) {
				max=s.affectedDays;
			}
		return max;
	
	}
}
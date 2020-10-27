import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
	Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();

	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c,w);
	}
	
	public void showSymptoms(){
		for (Symptom s: symptoms)
			s.show();
	}
	public void cure(){
		for (Symptom s: symptoms)
			s.cure();
	}

	double calcCovid19Impact() {

		double impact;

		Afection a= new Afection(symptoms);

		//calculate afection
		double afection = a.calculateAfections();


		//calculate increment
		Increment i=new Increment();
		double increment=i.calculateIncrement(getYears(),afection);


		//calculate impact
		Impact im= new Impact();

		impact= im.calculateImpact(getYears(),afection, increment);


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
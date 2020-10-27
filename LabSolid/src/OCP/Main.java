package OCP;


public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1 = new Covid19Pacient();
		p1.setName("Mikel");
		p1.setYears(22);
		
		
		
		CardioVascularSymptom c = new CardioVascularSymptom();
		c.setCovidImpact(2);
		c.setSeverityIndex(3);
		c.setAffectedDays(4);
		c.setName("Cefalea");
		
		NeuroMuscularSymptom n = new NeuroMuscularSymptom();
		n.setCovidImpact(2);
		n.setSeverityIndex(3);
		n.setAffectedDays(5);
		n.setName("Astenia");
		
		RespiratorySymptom r = new RespiratorySymptom();
		r.setCovidImpact(2);
		r.setSeverityIndex(3);
		r.setAffectedDays(4);
		r.setName("Expectoracion");
		
		
		
		p1.addSymptom(c, 1);
		p1.addSymptom(n, 1);
		p1.addSymptom(r,1);
	
		
		
		
	
		System.out.println("Pazientea noiz sendatuko da: " + p1.sanatedDays());
	}

}

package ISP;


public class Increment implements Incrementable{

	public double calculateIncrement(Yearsable per, double afection){
		if (per.getYears()>65) return afection*0.5; else return 0;
	}

	

	

	

	
}

package ISP;

import java.util.HashMap;
import java.util.Map;

public class Pertsona implements Yearsable{
	String name, adina;
	

	@Override
	public int getYears() {
		
		return Integer.parseInt(this.adina);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdina() {
		return adina;
	}

	public void setAdina(String adina) {
		this.adina = adina;
	}
	double calcCovid19Impact() {

		double impact;

		//calculate increment
		Increment i=new Increment();
		int adina=Integer.parseInt(getAdina());
		
		double increment=i.calculateIncrement(this,40.00);


		//calculate impact
		Impact im= new Impact();

		impact= im.calculateImpac(adina,40.00, increment);


		return impact;
	}

	
}

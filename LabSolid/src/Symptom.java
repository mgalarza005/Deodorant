
public abstract class Symptom {
	public String name;
	int covidImpact; 
	int severityIndex;
	int affectedDays;

	public int getAffectedDays() {
		return affectedDays;
	}
	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"+
				severityIndex+" covidImpact:"+this.covidImpact);
	}
	public void cure(){
		System.out.println("treatment applied to: "+name);
	}
}

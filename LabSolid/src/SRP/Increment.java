package SRP;


public class Increment {

	public double calculateIncrement(int years, double afect) {
		if(years>45 && years<65) {
			return afect*0.3;
		}else if(years>65) {
			return afect*0.5;
		}
		return 0;
	}
}

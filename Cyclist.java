package participant;

import java.util.Random;
/*Swimer preserent the Cyclist */
public class Cyclist extends Athlete {
	/*Construction method*/
	public Cyclist(String name, String state, int age) {
		super(name, state, age);
		
	}
    /*compete()method which is override from Iterface of Athlete,to generate a double from 500 to 800*/
	@Override
	public double compete(String s) {
		double result = new Random().nextDouble() * 300 + 500;
		return result;
	}

}

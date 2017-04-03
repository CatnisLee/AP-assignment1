package participant;

import java.util.Random;
/*Swimer preserent the Cyclist */
public class Cyclist extends Person implements Athlete {
	/*Construction method*/
	Cyclist(String name, String state, int age) {
		super(name, state, age);
		
	}

	@Override
	public double compete(String s) {
		double result = new Random().nextDouble() * 300 + 500;
		return result;
	}

}

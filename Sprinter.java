package participant;

import java.util.Random;
/*Sprinter preserent the Sprinter */
public class Sprinter extends Person implements Athlete {
	/*Construction method*/
	Sprinter(String name, String state, int age) {
		super(name, state, age);
	}

	@Override
	public double compete(String s) {
		double result = new Random().nextDouble() * 10 + 10;
		return result;
	}
}

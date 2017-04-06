package participant;

import java.util.Random;
/*Sprinter preserent the Sprinter */
public class Sprinter extends Athlete {
	/*Construction method*/
	public Sprinter(String name, String state, int age) {
		super(name, state, age);
	}
    /*the method override from Interface Athlete,to generate a double from 10 to 20*/
	@Override
	public double compete(String s) {
		double result = new Random().nextDouble() * 10 + 10;
		return result;
	}
}

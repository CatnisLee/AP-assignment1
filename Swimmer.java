package participant;

import java.util.Random;

/*Swimer preserent the swimer */
public class Swimmer extends Athlete {
    /*Construction method*/
	public Swimmer(String name, String state, int age) {
		super(name, state, age);
	}
    
	/*the method override from Interface Athlete,to generate a double from 100 to 200*/
	@Override
	public double compete(String s) {
		double result =new Random().nextDouble() * 100 + 100;
		return result;
	}
}

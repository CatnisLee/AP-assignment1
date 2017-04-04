package participant;

import java.util.Random;
/*class superAthlete*/
public class SuperAthlete extends Person implements Athlete {
	/*Construction method*/
	SuperAthlete(String name, String state, int age) {
		super(name, state, age);
	}

	/*the superAlthlete can do all the three games
	 * which will be determined by the String s,*/
	@Override
	public double compete(String s) {
		double result = 0;
		if(s.equals("swimGame")){
			result = new Random().nextDouble() * 100 + 100;
		}else if(s.equals("cycleGame")){
			result = new Random().nextDouble() * 300 + 500;
		}else if(s.equals("runGame")){
			result = new Random().nextDouble() * 10 + 10;
		}
		return result;
	}

}

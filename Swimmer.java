package participant;

import java.util.Random;

/*Swimer preserent the swimer */
public class Swimmer extends Person implements Athlete {
    /*Construction method*/
	Swimmer(String name, String state, int age) {
		super(name, state, age);
	}

	@Override
	public double compete(String s) {
		double result =new Random().nextDouble() * 100 + 100;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(new Swimmer("bnb", "ghgh", 10).compete("s"));
	}

}

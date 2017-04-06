//written by JIAHUI LI
package participant;

import java.util.ArrayList;
import java.util.Collections;

/*class Officical extens from Person,present the referee*/
public class Official extends Person {
    //the constuctor of the class 
	public Official(String name, String state, int age) {
		super(name, state, age);
	}
	
	/*
	 * the referee have to summarise the result and rank them
	 * double[] result is the result of the athletes in a game
	 * return int[3] is the index of the top three athlete
	 */
	public int[] summarise(ArrayList<Athlete> athleteOfOneGame, ArrayList<Double> timesOfOneGame){
		int[] top = {0,0,0};
		//copy the ArrayList timesOfOneGame
		ArrayList<Double> sortList = new ArrayList<Double>();
		for(double b : timesOfOneGame){
			sortList.add(b);
		}
		//sort the copy ArrayList
		Collections.sort(sortList);
		//top[0] will be = the index of the osrtList's min double.
		top[0] = timesOfOneGame.indexOf(sortList.get(0));
		top[1] = timesOfOneGame.indexOf(sortList.get(1));
		top[2] = timesOfOneGame.indexOf(sortList.get(2));
		return top;
	}
	
}

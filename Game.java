//written by JIAHUI LI
package participant;

import java.util.ArrayList;
import java.util.Arrays;


/*define a abstract class Game*/
public abstract class Game {
	//denfine an ArrayList to collect the Athlete of a game.
	private ArrayList<Athlete> athleteOfOneGame = new ArrayList<Athlete>();
	//denfine an ArrayList to store the time of every athlete in the game
	private ArrayList<Double> timesOfOneGame = new ArrayList<Double>();
	//to store the top 3 Athlete ,which will add points and be displayed in console
	private ArrayList<Athlete> top3 = new ArrayList<Athlete>();
	private String ID;  
	private String type;
	private Official referee;   //a game has an Official to be the referee.

	
	public void start(){
		//run the method of all athlete
		for(Athlete athlete : this.athleteOfOneGame){
			timesOfOneGame.add(athlete.compete(type));
		}
		for(double time: this.timesOfOneGame){
			System.out.println("\t" + time);
		}
		System.out.println();
		//let the referee to return the top3 athlete's index in int[] top3
 		int[] top = referee.summarise(athleteOfOneGame,timesOfOneGame);
		top3.add(athleteOfOneGame.get(top[0]));
		athleteOfOneGame.get(top[0]).addScores(5);   //reward the athlete
		top3.add(athleteOfOneGame.get(top[1]));
		athleteOfOneGame.get(top[1]).addScores(3);
		top3.add(athleteOfOneGame.get(top[2]));
		athleteOfOneGame.get(top[2]).addScores(1);
		System.out.println(Arrays.toString(top));
	}
	
	
    //to dispaly all the athlete of a game
	public void displayAllAthlete(){
		for(Athlete athlete : athleteOfOneGame){
			System.out.println( athlete + "\t" + athlete.getScores());
		}
	}
	
	
	/* set/get medoths of the class*/
	public ArrayList<Athlete> getTop3(){
		return top3;
	}
	public ArrayList<Double> getTimesOfOneGame(){
		return timesOfOneGame;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}	
	public Official getReferee() {
		return referee;
	}
	public void setReferee(Official referee) {
		this.referee = referee;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<Athlete> getAthleteOfOneGame(){
		return athleteOfOneGame;
	}
}






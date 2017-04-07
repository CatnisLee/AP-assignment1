// Written by JIAHUI LI
package participant;

import java.util.ArrayList;
import java.util.Arrays;


// Firstly, define a abstract class Game.
public abstract class Game {
	private ArrayList<Athlete> athleteOfOneGame = new ArrayList<Athlete>();
	//Define an ArrayList in order to collect the Athlete of Game.
	
	private ArrayList<Double> timesOfOneGame = new ArrayList<Double>();
	//Define an ArrayList in order to store the time of each athlete in a game.
	
	private ArrayList<Athlete> top3 = new ArrayList<Athlete>();
	//Aims to store the Athlete of top 3 ,which will add points and be displayed in console.

	private String ID;  
	private String type;
	private Official referee;   
	//Each game has an Official as a referee.

	
	public void start(){
		//In order to run the method of all athletes.
		for(Athlete athlete : this.athleteOfOneGame){
			timesOfOneGame.add(athlete.compete(type));
		}
		for(double time: this.timesOfOneGame){
			System.out.println("\t" + time);
		}
		System.out.println();
		//Let the referee to return the index of top3 athlete's  in int[] top3 .
 		int[] top = referee.summarise(athleteOfOneGame,timesOfOneGame);
		top3.add(athleteOfOneGame.get(top[0]));
		athleteOfOneGame.get(top[0]).addScores(5);   //reward the athlete
		top3.add(athleteOfOneGame.get(top[1]));
		athleteOfOneGame.get(top[1]).addScores(3);
		top3.add(athleteOfOneGame.get(top[2]));
		athleteOfOneGame.get(top[2]).addScores(1);
		System.out.println(Arrays.toString(top));
	}
	
	
    	//In order to display all athletes of a game.
	public void displayAllAthlete(){
		for(Athlete athlete : athleteOfOneGame){
			System.out.println( athlete + "\t" + athlete.getScores());
		}
	}
	
	
	// Set/Get methods of the class.
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






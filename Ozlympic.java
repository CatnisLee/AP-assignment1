// Written by PEIGEN GENG
package Control;

import java.util.ArrayList;
import java.util.Scanner;

import participant.Athlete;
import participant.Game;

public class Ozlympic {
	//the user's selected Game
	private static int predictGameIndex;
	//the user's selected Athlete
	private static int predictAthleteIndex;
	
	
	
	public static void process(ArrayList<Game> games){
		diplayMenu();
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option){
			case 1:selectAGame(games);
			case 2:predict(games);
			case 3:start(games);
			case 4:displayGamesResults(games);
			case 5:displayAthletesResults(games);
			case 6:System.exit(0);
			default: 
				  System.out.println("Your input is wrong!");   //when your input is out of 1-6
				  process(games);
		}
	}
	/*to display the menu of the game*/
	private static void diplayMenu(){
		System.out.println("Ozlympic Game");
		System.out.println("=============================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final results of all games");
		System.out.println("5. Display the points of all athletes");
		System.out.println("6. Exit");
		System.out.println();
		System.out.print("Enter an option:");
	}
	
	/*when option is 5,to display all the athlete's scores*/
	private static void displayAthletesResults(ArrayList<Game> games) {
		for(Game game : games){
			game.displayAllAthlete();
		}
	}

	/*when option is 4,to display all the results*/
	private static void displayGamesResults(ArrayList<Game> games) {
		printTotalResult(games);
		
		printRanks(games);
			
		System.out.println();
		System.out.println("Your chice: " + games.get(predictGameIndex).getID( )+ "  "  
				            + games.get(predictGameIndex).getAthleteOfOneGame().get(predictAthleteIndex)); 
		System.out.println("The result is " + games.get(predictGameIndex).getTop3().get(0));
		if(games.get(predictGameIndex).getTop3().get(0) 
				== games.get(predictGameIndex).getAthleteOfOneGame().get(predictAthleteIndex)){
			System.out.println("Congratulations! YOU ARE RIGHT!");
		}else{
			System.out.println("YOU ARE WRONG!");
		}
		System.out.println();
		process(games);
	}
	/*the ranks of all the games*/
	private static void printRanks(ArrayList<Game> games) {
		System.out.println("The ranks:");
		for(Game game : games){
			System.out.println(game.getType() + "\t" 
                    + game.getID() + "\t" + game.getReferee().getName());
			System.out.println("First: " + game.getTop3().get(0));
			System.out.println("Second: " + game.getTop3().get(1));
			System.out.println("Thrid: " + game.getTop3().get(2));
			System.out.println();
		}
	}
   
	/*the tatal result of all the games*/
	private static void printTotalResult(ArrayList<Game> games) {
		System.out.println("Final Result!");
		for(Game game : games){
			System.out.println(game.getType() + "\t" 
		                      + game.getID() + "\t" + game.getReferee().getName());
			for(Athlete athlete : game.getAthleteOfOneGame()){
				/*game.getTimesOfOneGame().get(game.getAthleteOfOneGame().indexOf(athlete) 
				 * is the result time of the current athlete*/
				System.out.println(athlete + "\t" 
				 + game.getTimesOfOneGame().get(game.getAthleteOfOneGame().indexOf(athlete)));
			}
			System.out.println();
		}
	}

	
	/*when option is 3,start the games*/
	private static void start(ArrayList<Game> games) {
		for(Game game : games){
			game.start();
		}
		System.out.println();
		process(games);
	}
	
	
	/*when option is 2,the user select an athlete in the game he choose in the option1*/
	private static void predict(ArrayList<Game> games) {
		int i = 1;
		for(Athlete athelete : games.get(predictGameIndex).getAthleteOfOneGame()){
			System.out.println(Integer.toString(i) + " ) " + athelete);
			i++;
		}
		System.out.println("Please input your choice? ");
		Scanner scanner = new Scanner(System.in);
		predictAthleteIndex = scanner.nextInt() - 1;
		System.out.println("Your choice is :" +  "  " 
		                  + games.get(predictGameIndex).getAthleteOfOneGame().get(predictAthleteIndex));
		System.out.println();
		process(games);
	}

	
	/*when option is 1,choose a game to guess!*/
	private static void selectAGame(ArrayList<Game> games) {
		int i = 1;
		System.out.println("Selection\tGameID");
		for(Game game : games){
			System.out.println(i++ + "\t" +  game.getID());
		}
		System.out.println("Please input your choice? ");
		Scanner scanner = new Scanner(System.in);
		predictGameIndex = scanner.nextInt() - 1;
		
		System.out.println("Your choice is : "  + games.get(predictGameIndex).getID());
		System.out.println();
		process(games);
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Game> games = new ArrayList<Game>();
		games = new Generator().allGames;
		process(games);
		
	}
}

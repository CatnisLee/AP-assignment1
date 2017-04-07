//written by JIAHUI LI
package Control;

import java.util.ArrayList;

import participant.*;

/*
 * generate a ArrayList<Game> allGames,which will be sent to the
 * class Ozlympic,as the basic data to run.
 */
public class Generator {
	//to store the games of the project
	public static  ArrayList<Game> allGames = new ArrayList<Game>();
	
	Generator(){
		/*
		 * create game1,there are 8 Athlete in the game and a referee
		 * and in the 8,7 are swimmer,and the rest one is a superAthlete
		 * besides,there is an Official in the game1
		 */
		Game game1 = new SwimGame("S01");
		game1.getAthleteOfOneGame().add(new Swimmer("Ezra","USA",18));
		game1.getAthleteOfOneGame().add(new Swimmer("Ezra","USA",18));
		game1.getAthleteOfOneGame().add(new Swimmer("Bob","CHINA",20));
		game1.getAthleteOfOneGame().add(new Swimmer("Sara","USA",25));
		game1.getAthleteOfOneGame().add(new Swimmer("Ajdk","UK",26));
		game1.getAthleteOfOneGame().add(new Swimmer("Bew","USA",23));
		game1.getAthleteOfOneGame().add(new Swimmer("Cds","JAPAN",21));
		game1.getAthleteOfOneGame().add(new SuperAthlete("Eenm","USA",20));
		//a game have a resferee to summrise the result
		game1.setReferee(new Official("Jack", "China", 25));
		//add the game1 into the ArrayList<Game> allGames
		allGames.add(game1);
		
		//create game2
		Game game2 = new SwimGame("S02");
		game2.getAthleteOfOneGame().add(new SuperAthlete("Fasm","India",24));
		game2.getAthleteOfOneGame().add(new Swimmer("Ddmk","USA",29));
		game2.getAthleteOfOneGame().add(new Swimmer("Eioi","CANADA",30));
		game2.getAthleteOfOneGame().add(new Swimmer("Fqw","FRANCE",20));
		game2.getAthleteOfOneGame().add(new Swimmer("Gsas","USA",19));
		game2.getAthleteOfOneGame().add(new Swimmer("Hmkn","KREAN",18));
		game2.getAthleteOfOneGame().add(new SuperAthlete("Gms","CHINA",18));
		game2.getAthleteOfOneGame().add(new SuperAthlete("Hbnb","CANADA",24));
		game2.setReferee(new Official("Amada", "UK", 30));
		//add the game1 into the ArrayList<Game> allGames
		allGames.add(game2);
		
		//create game3
		Game game3 = new RunGame("R03");
		game3.getAthleteOfOneGame().add(new Sprinter("Isa","RUSSIA",25));
		game3.getAthleteOfOneGame().add(new Sprinter("Jfd","JAPAN",23));
		game3.getAthleteOfOneGame().add(new Sprinter("klds","CHINA",20));
		game3.getAthleteOfOneGame().add(new Sprinter("Loid","CHINA",24));
		game3.getAthleteOfOneGame().add(new Sprinter("Myue","RUSSIA",20));
		game3.getAthleteOfOneGame().add(new Sprinter("Nbb","USA",22));
		game3.getAthleteOfOneGame().add(new SuperAthlete("Gms","CHINA",18));
		game3.getAthleteOfOneGame().add(new SuperAthlete("Hbnb","CANADA",24));
		game3.setReferee(new Official("Herry", "India", 20));
		allGames.add(game3);
		
		//create game4
		Game game4 = new RunGame("R04");
		game4.getAthleteOfOneGame().add(new Sprinter("Owa","JAPAN",20));
		game4.getAthleteOfOneGame().add(new Sprinter("Rdw","RUSSIA",21));
		game4.getAthleteOfOneGame().add(new Sprinter("Topk","CHINA",18));
		game4.getAthleteOfOneGame().add(new Sprinter("Sbv","USA",20));
		game4.getAthleteOfOneGame().add(new SuperAthlete("Inm","USA",16));
		game4.getAthleteOfOneGame().add(new SuperAthlete("Jbn","CHINA",24));
		game4.setReferee(new Official("Rosy", "Japan", 35));
		allGames.add(game4);
		
		//create game5
		Game game5 = new CyclyGame("R05");
		game5.getAthleteOfOneGame().add(new Cyclist("Uqs","RUSSIA",27));
		game5.getAthleteOfOneGame().add(new Cyclist("Vdqs","CHINA",17));
		game5.getAthleteOfOneGame().add(new Cyclist("Wal","India",37));
		game5.getAthleteOfOneGame().add( new Cyclist("Xlo","CHINA",23));
		game5.getAthleteOfOneGame().add(new Cyclist("Ywi","JAPAN",21));
		game5.getAthleteOfOneGame().add(new SuperAthlete("Inm","USA",16));
		game5.setReferee(new Official("Nsdds", "USA", 37));
		allGames.add(game5);
		
		//create game6
		Game game6 = new CyclyGame("R06");
		game6.getAthleteOfOneGame().add(new Cyclist("Zpp","CANADA",20));
		game6.getAthleteOfOneGame().add(new Cyclist("Anb","India",19));
		game6.getAthleteOfOneGame().add(new Cyclist("Bdyt","CANADA",27));
		game6.getAthleteOfOneGame().add(new Cyclist("Cmmn","USA",23));
		game6.getAthleteOfOneGame().add(new Cyclist("Dwe","CANADA",18));
		game6.getAthleteOfOneGame().add(new SuperAthlete("Jackion","USA",20));
		game6.getAthleteOfOneGame().add(new SuperAthlete("Jmnn","UK",20));
		game6.getAthleteOfOneGame().add(new SuperAthlete("Mnbj","USA",24));
		game6.setReferee(new Official("Annj", "China", 34));
		allGames.add(game6);
		
		/*all the Athlete are the secind time to take part in a game*/
		Game game7 = new CyclyGame("R07");
		game7.getAthleteOfOneGame().add(new SuperAthlete("Jbn","CHINA",24));
		game7.getAthleteOfOneGame().add(new SuperAthlete("Hab","India",28));
		game7.getAthleteOfOneGame().add(new SuperAthlete("Sue","UK",24));
		game7.getAthleteOfOneGame().add(new SuperAthlete("Inm","USA",16));
		game7.getAthleteOfOneGame().add(new SuperAthlete("Jbn","CHINA",24));
		game7.getAthleteOfOneGame().add(new SuperAthlete("Eenm","USA",20));
		game7.setReferee(new Official("Adns", "China", 23));
		allGames.add(game7);
	}
	//to test the class and the method of it
	public static void main(String[] args) {
		Generator generator = new Generator();
		for(Game game : allGames){
			System.out.println(game.getID() + "\t" + game.getType());
			game.displayAllAthlete();
			System.out.println();
		}
			
	}
	
}

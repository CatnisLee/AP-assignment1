// Written by JIAHUI LI
package participant;

public abstract class Athlete extends Person implements Competable {
	Athlete(String name, String state, int age) {
		super(name, state, age);
	}
    //Each Athlete has themselves scores.
	private int scores;
     
	//Here is the method of the scores.
	public int getScores() {
		return scores;
	}

	public void addScores(int scores) {
		this.scores += scores;
	}
}

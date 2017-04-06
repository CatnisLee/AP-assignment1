//written by JIAHUI LI
package participant;

public abstract class Athlete extends Person implements Competable {
	Athlete(String name, String state, int age) {
		super(name, state, age);
	}
    //each Athlete has his/her scores
	private int scores;
     
	/*the set/get method of the scores*/
	public int getScores() {
		return scores;
	}

	public void addScores(int scores) {
		this.scores += scores;
	}
}

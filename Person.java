package participant;

/*
 * class Person define a class of all the person in the game,
 * includeing Athlete and Official.
 */

public abstract class Person {
	//count :to count the numer of person and make every ID unique.
	public static int count = 10000;
	private int ID;
	private String name;
	private String state;
	private int age;
	private int points;
	
	//Construction method,including args name,state and age to construct a person
	Person(String name,String state,int age){
		this.setName(name);;
		this.setAge(age);
		this.setState(state);
		ID = count++;
	}
	
	public String toString(){
		return  Integer.toString(getID()) + "\t" + getName() + "\t" 
				+ getAge() + "\t" + getState() ;
	}
	
	/*the set/get methods of all the private fields*/
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}

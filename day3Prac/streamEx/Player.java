package day3Prac.streamEx;

public class Player {
	String name;
	int age;
	String country;
	int mins;
	int goals;
	
	public Player(String name, int age, String country, int mins, int goals) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.mins = mins;
		this.goals = goals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + ", mins=" + mins + ", goals=" + goals
				+ "]";
	}
	
	
}

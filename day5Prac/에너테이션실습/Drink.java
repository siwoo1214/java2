package day5Prac.에너테이션실습;

public class Drink {
	String name;
	@MaxSuger(25)
	int suger;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSuger() {
		return suger;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	@Override
	public String toString() {
		return "Drink [name=" + name + ", suger=" + suger + "]";
	}
	public Drink(String name, int suger) {
		super();
		this.name = name;
		this.suger = suger;
	}
	
	public Drink() {
		// TODO Auto-generated constructor stub
	}
}

package day5Prac.에너테이션실습;

public class Food {
	
	String name;
	
	@MaxCalorie(value=280)   //default를 주면 값을 안줘도 ok
	int calorie;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", calorie=" + calorie + "]";
	}
	public Food(String name, int calorie) {
		super();
		this.name = name;
		this.calorie = calorie;
	}
	
	public Food() {
		// TODO Auto-generated constructor stub
	}
}

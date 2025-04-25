package day1prac.정렬;

public class Acorn2 implements MyComparable{
	String id;
	String name;
	int point;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Acorn2(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}
	public Acorn2() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acorn2 [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
	
	@Override
	public int compareTo(Object other) {
		//기준 비교 other
		Acorn2 acorn = (Acorn2)other;
		return this.point-acorn.point;
	}
	
}

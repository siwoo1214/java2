package day1.prac.정렬제네릭;

public class Acorn implements Comparable<Acorn>{
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
	public Acorn(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	public Acorn() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
	@Override
	public int compareTo(Acorn o) {
		// TODO Auto-generated method stub
		return this.point-o.point;
	}
	
}

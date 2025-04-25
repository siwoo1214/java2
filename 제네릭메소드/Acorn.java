package 제네릭메소드;

public class Acorn {
	String id;
	String name;
	int point;
	
	public Acorn(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", point=" + point + "]";
	}

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
	
	
}

package day3Prac.comparator인터페이스;

public class Acorn{
	String id;
	String name;

	
	public Acorn() {}

	public Acorn(String id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name+ "]";
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

//	@Override   //비교대상 객체를 넣어줌
//	public int compareTo(Acorn this, Object o) {    //나 자신과 other객체를 비교하는 것임
//		Acorn acorn = (Acorn)o;    //양수, 음수, 0 양수가 전달되면 라이브러리에서 정렬을 수행함
//		
//		return this.point - acorn.point;  //기준 - 비교대상(기준이 양수가 가면 비교시작한다)
//	}
	
	
}

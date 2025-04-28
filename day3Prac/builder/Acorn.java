package day3Prac.builder;

public class Acorn {
	String id;
	String pw;
	String name;
	int point;
	
	//빌더패턴 사용하기
	//빌더 객체를 생성해서 에이콘 객체 생성하기
	
	private Acorn(Builder builder) {
		this.id=builder.id;
		this.pw=builder.pw;
		this.name=builder.name;
		this.point=builder.point;
	}
	
	//inner Class
	static class Builder{
		String id;
		String pw;
		String name;
		int point;
		
		Builder id(String id) {
			this.id=id;
			return this;
		}
		
		Builder pw(String pw) {
			this.pw=pw;
			return this;
		}
		
		Builder name(String name) {
			this.name=name;
			return this;
		}
		
		Builder point(int point) {
			this.point=point;
			return this;
		}
		
		Acorn build() {
			return new Acorn(this);
		}
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + ", name=" + name + ", point=" + point + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

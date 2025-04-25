package day1.실습;

public class MyName extends Cook{
	String type;
	
	public MyName(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public MyName(String name, String type) {
		super(name);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MyName [type=" + type + ", name=" + name + "]";
	}
	
	
}

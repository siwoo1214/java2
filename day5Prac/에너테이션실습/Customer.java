package day5Prac.에너테이션실습;

public class Customer {
	
	String name;
	
	@MAXLen(length=13)
	String tel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", tel=" + tel + "]";
	}

	public Customer(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
}

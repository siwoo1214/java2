package day5Prac.에너테이션실습;

public class Employee {
	
	String name;
	
	@WeekDaysAvail(value= {"Monday","Friday"})
	String offday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffday() {
		return offday;
	}

	public void setOffday(String offday) {
		this.offday = offday;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", offday=" + offday + "]";
	}

	public Employee(String name, String offday) {
		super();
		this.name = name;
		this.offday = offday;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}

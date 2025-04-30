package day5Prac.enum실습하기;

// Mode enum
public class MonitorNew {
	String name;
	Mode mode;
	String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Mode getMode() {
		return mode;
	}
	public void setMode(Mode mode) {
		this.mode = mode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "MoniterNew [name=" + name + ", mode=" + mode + ", brand=" + brand + "]";
	}
	public MonitorNew(String name, Mode mode, String brand) {
		super();
		this.name = name;
		this.mode = mode;
		this.brand = brand;
	}
	
	public MonitorNew() {
		// TODO Auto-generated constructor stub
	}
}

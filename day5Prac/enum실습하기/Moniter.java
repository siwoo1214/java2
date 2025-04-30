package day5Prac.enum실습하기;

public class Moniter {
	String name;
	String mode;   //DARK, LIGHT
	String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
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
		return "Moniter [name=" + name + ", mode=" + mode + ", brand=" + brand + "]";
	}
	public Moniter(String name, String mode, String brand) {
		super();
		this.name = name;
		this.mode = mode;
		this.brand = brand;
	}
	
	public Moniter() {
		// TODO Auto-generated constructor stub
	}
}

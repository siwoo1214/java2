package day3Prac.stream2;

import java.util.Objects;

public class Moving {
	String name;
	String code;
	int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}
	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}
	
	public Moving() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(code, name, power);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moving other = (Moving) obj;
		return Objects.equals(code, other.code) && Objects.equals(name, other.name) && power == other.power;
	}
	*/
	
	//얘넨 set을 쓸 때 사용한다
//	@Override
//	public boolean equals(Object obj) {  //자기자신과 obj 비교대상과 같은지 판단
//		Moving m = (Moving)obj;
//		return this.getName().equals(m.getName())&&this.getCode().equals(m.getCode())&&this.getPower()==m.getPower();
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(code,name,power);  //객체 생성시에 입력값이 같으면 생성된 객체가 같은 hashcode로 생성된다
//	}
	
}

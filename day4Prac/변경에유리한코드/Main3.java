package day4Prac.변경에유리한코드;

public class Main3 {
	public static void main(String[] args) {
		Animal dog = getAnimal();
		dog.bark();
		Animal dog2 = getAnimal();
		dog2.bark();
		
		
	}

	// 메소드를 이요하면 더 간편해진다
	// 객체를 얻어오는 부분을 매서드로 만들기
	private static Animal getAnimal() {
		return new Cat();
	}
}

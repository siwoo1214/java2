package day4Prac.변경에유리한코드;

public class Main2 {
	public static void main(String[] args) {
		
		// Dog객체 2개 만들기
		/*
		Animal dog = new Dog();
		dog.bark();
		
		Animal dog2 = new Dog();
		dog2.bark();
		*/
		
		//Dog를 Cat으로 바꾸기
		//상속을 이용하면 코드의 재사용성이 높아진다
		Animal cat = new Cat();
		cat.bark();
		
		Animal cat2 = new Cat();
		cat2.bark();
	}
}

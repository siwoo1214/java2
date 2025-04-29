package day4Prac.변경에유리한코드;

public class Main1 {
	public static void main(String[] args) {
		
		// Dog객체
		// Dog -> Cat 으로 변경
//		Dog dog = new Dog();
//		dog.bark();
//		
//		Dog dog2 = new Dog();
//		dog2.bark();
		
		//변경포인트 확인하기
		Cat cat = new Cat();
		cat.bark();
		
		Cat cat2 = new Cat();
		cat2.bark();
		
		
//		Cat cat = new Cat();
	}
}

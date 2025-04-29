package day4Prac.reflect;

import java.lang.reflect.InvocationTargetException;

public class Ex02 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		// 1.클래스정보 얻어오기
		// 클래스로부터 클래스정보 얻어오기
		Class clazz = Member.class;
		
		// 2.clazz 객체를 생성하기
		// 기본생성자를 사용하여 호출하기
		Member m = (Member)clazz.getDeclaredConstructor().newInstance();  //newInstance() = 기본생성자
		
		// 3.객체의 메서드 호출하기
		m.printInfo();
		m.printSquare(14);
		
		// 매개변수 있는 생성자로 객체 생성하기
		Member m2 = (Member)clazz.getDeclaredConstructor(String.class,String.class).newInstance("park","1214");
		m2.printInfo();
		m2.printSquare(33);
	}
}

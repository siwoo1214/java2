package day4Prac.reflect;

import java.lang.reflect.InvocationTargetException;

public class Ex03 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// 1.클래스 정보 얻어오기
		// 생성된 객체로부터 클래스정보 얻어오기
		Member m = new Member();
		Class clazz = m.getClass();
		
		Member m2 = (Member)clazz.getDeclaredConstructor().newInstance();
		m2.printInfo();
		m2.printSquare(22);
	}
}

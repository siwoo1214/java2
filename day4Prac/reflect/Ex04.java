package day4Prac.reflect;

import java.lang.reflect.InvocationTargetException;

public class Ex04 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// 1. 클래스정보 얻어오기
		// Class.forName(); 사용하기
		
		Class clazz = Class.forName("day4Prac.reflect.Member");
		Member m = (Member)clazz.getDeclaredConstructor(String.class,String.class).newInstance("kwon","0101");
		m.printInfo();
	}
}

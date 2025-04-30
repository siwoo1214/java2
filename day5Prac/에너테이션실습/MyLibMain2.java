package day5Prac.에너테이션실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyLibMain2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyLib lib = new MyLib();
		
		lib.printStar2(5);
		
		Class clazz = lib.getClass();
		Method method = clazz.getDeclaredMethod("printStar2",int.class);
		
		Before anno = method.getAnnotation(Before.class);
		String before = anno.before();
		
		System.out.println(before);
		
		method.invoke(lib, 5);   //메소드를 실행할 객체, 매개변수
		
	}
}

package day5Prac.에너테이션실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyLibMain {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyLib lib = new MyLib();
//		lib.printStar();
		
		Class clazz = lib.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method m : methods) {
			System.out.println(m);
			
			//@Before 애너테이션
			Before anno = m.getAnnotation(Before.class);
			
			if(anno!=null) {
				String beforeStr = anno.before();
				System.out.println(beforeStr);
				
				m.invoke(lib);   //객체생성 없이 갹채 메소드를 호출할 수 없는 원리랑 똑같음
			}
		}
	}
}

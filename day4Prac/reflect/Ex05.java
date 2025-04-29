package day4Prac.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("day4Prac.reflect.Member");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method a : methods) {  
			System.out.println(a);   //메소드객체의 배열로 메소드정보들을 출력할 수 있음
		}
		
		//객체배열을 스트림으로 얻어오기 (객체배열은 주로 스트림으로 불러온다)
		Stream.of(methods).forEach(System.out::println);
		//기본형배열, 객체배열 모두 사용 가능하다 (스트림으로 얻어오기)
		Arrays.stream(methods).forEach(System.out::println);
	}
}

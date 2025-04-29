package day4Prac.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

public class 파일읽기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("src/day4Prac/reflect/config.txt"));
		
		String line = br.readLine();
		System.out.println(line);
		
		String[] info = line.split("=");
		
		String key = info[0];
		String value = info[1];
		
		System.out.println(value);
		
		Class clazz = Class.forName(value);
		
		// 1. 객체 생성하기(기본생성자)
		Member m = (Member)clazz.getDeclaredConstructor().newInstance();
		
		//메소드 가져오기
		Method method = clazz.getDeclaredMethod("printInfo");
		method.invoke(m);
		
		Method method2 = clazz.getDeclaredMethod("printSquare", int.class);
		method2.invoke(m, 4);
		// 
	}
}

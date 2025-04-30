package day5Prac.필드정보가져오기;

import java.lang.reflect.Field;

public class Ex01 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		//Store 객체의 메서드 정보 출력하기
		//Store 객체의 필드정보 출력하기
		
		Store store = new Store(3,5);
		
		//클래스정보 얻어오기
		Class clazz = store.getClass();
		
		//메서드 정보 출력하기
		
		//필드정보 출력하기
		//선언된 필드의 이름 출력하기
		Field[] fields = clazz.getDeclaredFields();
		for(Field a : fields) {
			System.out.println(a.getName()+" "+a.get(store));
			a.set(store, 10);  //각각의 필드에 따라 값을 다르게 부여할 수도 있음
		}
		System.out.println(store);
	}
}

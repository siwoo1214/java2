package day5Prac.에너테이션실습;

import java.lang.reflect.Field;

public class CustomerMain {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Customer c = new Customer("홍길동","010-1111-2222321123");
		
		//customer객체 검증하기
		
		검증하기(c);
	}

	private static void 검증하기(Object c) throws IllegalArgumentException, IllegalAccessException {
		
		// 1. 객체에 대한 클래스 정보 얻어오기
		Class clazz = c.getClass();
		
		// 2. 필드 정보 가져오기
		Field[] fields = clazz.getDeclaredFields();
		
		// 3. 필드에 애너테이션 정보 가져오기
		for(Field a : fields) {
			//각 필드정보 가져오기, 필드이름, 필드의 실제 값, 필드 타입, 필드 에너테이션 정보
			MAXLen anno = a.getAnnotation(MAXLen.class);  //필드에 애너테이션
			
			if(anno!=null) {
				String name = a.getName();  //필드이름
				String value = (String)a.get(c);  //필드의 값(객체의 정보를 제공해 줘야함)
				
				int maxlen = anno.length();
				
				if(value.length()<=maxlen) {
					System.out.println("success");
				} else {
					System.out.println("fail");
					throw new RuntimeException("검증 실패");
				}
			}
		}
		
		// 4. 실제값과 에너테이션 정보 값을 판별하기
		
		
	}
}

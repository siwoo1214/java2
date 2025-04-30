package day5Prac.에너테이션실습;

import java.lang.reflect.Field;

public class Food검증하기 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Food food = new Food("비빔밥",530);
		
		검증하기(food);
	}

	private static void 검증하기(Food food) throws NoSuchFieldException, IllegalAccessException {
		//검증하기
		Class clazz = food.getClass();
		Field field = clazz.getDeclaredField("calorie");  //calorie필드만 검증하기
		
		// 필드의 값 가져오기
		// 애너테이션 정보 가져오기 => 280
		
		int realValue = (int)field.get(food);
		MaxCalorie anno = field.getAnnotation(MaxCalorie.class);  //애노테이션 객체정보 갖고오기
		int annoValue = anno.value();
		
		if(realValue > annoValue) {
			System.out.println("먹고 또 살 찔래? 바지 단추 또 풀릴래?");
		} else {
			System.out.println("코끼리도 풀만 먹는다지만 맛있게 드셔도 됩니다");
		}
	}
}

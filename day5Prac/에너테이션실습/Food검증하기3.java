package day5Prac.에너테이션실습;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Food검증하기3 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		//Food food = new Food("비빔밥",530);
		List<Food> foodList = new ArrayList<>();
		List<Food> diet = new ArrayList<>();
		
		foodList.add(new Food("비빔밥",530));
		foodList.add(new Food("샐러드",270));
		foodList.add(new Food("어묵",180));
		foodList.add(new Food("돈까스",480));
		foodList.add(new Food("우동",180));
		
		for(Food food : foodList) {
			if(검증하기(food)) {
				diet.add(food);
			}
		}
		
		System.err.println("\n다이어트 음식");
		diet.forEach(System.out::println); 
	}

	private static boolean 검증하기(Food food) throws NoSuchFieldException, IllegalAccessException {
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
			return false;
		} else {
			System.out.println("코끼리도 풀만 먹는다지만 맛있게 드셔도 됩니다");
			return true;
		}
	}
}

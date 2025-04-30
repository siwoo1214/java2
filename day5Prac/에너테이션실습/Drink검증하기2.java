package day5Prac.에너테이션실습;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Drink검증하기2 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		List<Drink> drinkList = new ArrayList<>();
		List<Drink> lowsuger = new ArrayList<>();
		
		drinkList.add(new Drink("콜라", 39));
		drinkList.add(new Drink("사이다", 35));
		drinkList.add(new Drink("알로에", 25));
		drinkList.add(new Drink("아메리카노", 0));
		drinkList.add(new Drink("초코우유", 27));

		for(Drink d : drinkList) {
			if(검증하기(d)) {
				lowsuger.add(d);
			}
		}
		
		System.out.println("저당음료 목록");
		lowsuger.forEach(System.out::println);
	}

	private static boolean 검증하기(Drink drink) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class clazz = drink.getClass();
		Field field = clazz.getDeclaredField("suger");
		
		int realValue = (int)field.get(drink);
		MaxSuger anno = field.getAnnotation(MaxSuger.class);
		int annoValue = anno.value();
		
		if(realValue<=annoValue) {
			System.out.println("당이 너무 많아요 당당해지시겠어요");
			return true;
		} else {
			System.out.println("건강한 음료입니다 !");
			return false;
		}
	}
}

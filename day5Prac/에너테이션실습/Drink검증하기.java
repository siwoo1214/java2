package day5Prac.에너테이션실습;

import java.lang.reflect.Field;

public class Drink검증하기 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		검증하기(new Drink("알로에",25));
	}

	private static void 검증하기(Drink drink) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class clazz = drink.getClass();
		Field field = clazz.getDeclaredField("suger");
		
		int realValue = (int)field.get(drink);
		MaxSuger anno = field.getAnnotation(MaxSuger.class);
		int annoValue = anno.value();
		
		if(realValue>annoValue) {
			System.out.println("당이 너무 많아요 당당해지시겠어요");
		} else {
			System.out.println("건강한 음료입니다 !");
		}
	}
}

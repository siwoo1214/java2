package day5Prac.에너테이션실습;

import java.lang.reflect.Field;

public class Weather검증하기 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Weather w1 = new Weather("맑음",45);
		검증하기(w1);
	}

	private static void 검증하기(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Class clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field f : fields) {
			NiceWeather anno = f.getAnnotation(NiceWeather.class);
			
			if(anno!=null) {
				String value = (String)f.get(obj);
				String[] weathers = anno.value();
				
				boolean result = false;
				for(String w : weathers) {
					if(value.equals(w)) {
						result=true;
					}
				}
				
				if(result) {
					System.out.println("날씨가 맑음입니다");
				} else {
					System.out.println("날씨가 구립니다");
					throw new RuntimeException("날씨 so bad");
				}
			}
		}
	}
}

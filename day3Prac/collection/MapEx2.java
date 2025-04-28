package day3Prac.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
	public static void main(String[] args) {
		//key, value
		//String, ArrayList<String>
		
		ArrayList<String> 과일목록 = new ArrayList<>();
		과일목록.add("딸기");
		과일목록.add("사과");
		과일목록.add("망고");
		
		ArrayList<String> 음료목록 = new ArrayList<>();
		음료목록.add("아메리카노");
		음료목록.add("라떼");
		음료목록.add("쌍화차");
		
		Map<String,ArrayList<String>> map = new HashMap<>();
		map.put("음료", 음료목록);
		map.put("과일", 과일목록);
		
		ArrayList<String> list1 = map.get("음료");
		list1.forEach(item->System.out.println(item));
		
		ArrayList<String> list2 = map.get("과일");
		list2.forEach((item)->{System.out.println(item);});
		
		//맵 전체 출력하기
		System.out.println("map 전체 출력");
		map.forEach((key,value)->{
			System.out.print(key+" ");    //key는 String
			value.forEach(item->System.out.print(item+" "));   //value는 ArrayList<String>
		});
		
		
	}
}

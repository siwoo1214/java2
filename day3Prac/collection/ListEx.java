package day3Prac.collection;

import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		//List -> ArrayList,LinkedList
		
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();  //부모타입List로 다루는 중
		list.add("사과");
		list.add("포도");
		list.add("망고");
		
		for(String a : list) {
			System.out.println(a);
		}
	}
}

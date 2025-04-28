package day3Prac.collection;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("사과");
		list.add("망고");
		list.add("참외");
		
		list.addFirst("오렌지");
		list.addFirst("포도");
		
		for(String a : list) {
			System.out.println(a);
		}
		
		String first = list.pop();
		System.out.println("제거된 첫번쨰 요소 : "+first);
		
		System.out.println("pop된 이후의 리스트");
		for(String a : list) {
			System.out.println(a);
		}
	}
}

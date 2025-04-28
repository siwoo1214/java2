package day3Prac.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class List와set을일관된방법으로다루기 {
	public static void main(String[] args) {
		// Iterator
		// list계열
		// set계열을 일관된 방법으로 반복할 수 있게 하는 것
		// 순서가 있는 것과 없는 것을 동일한 방법으로 반복시킬 수 있는 방법이 Iterator이다
		
		ArrayList<String> list = new ArrayList<>();
		list.add("사과");
		list.add("토마토");
		
		Set<String> set = new HashSet<>();
		set.add("사과 s");
		set.add("토마토 s");
		
		Collection<String> collection = list;
		//Iterator => 반복자
		Iterator<String> it = collection.iterator();  //iterator 선언할 때 제네릭 선언해줘야함
		
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		collection = set;
		
		Iterator<String> it2 = collection.iterator();
		while(it2.hasNext()) {
			String item = it2.next();
			System.out.println(item);
		}
	}
}

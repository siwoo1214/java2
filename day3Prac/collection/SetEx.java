package day3Prac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		//저장 할 데이터 중복허용하지 않음 (중복 안된것만 담고 저장하고싶음)
		//순서는 중요하지 않음 (순서 상관 x) 그래서 출력해도 순서가 이상하게 나올 수 있음
		Set<String> list = new HashSet<>();
		
		list.add("딸기");
		list.add("딸기");  //두번 담아도 한번만 담긴다
		list.add("망고");
		list.add("오렌지");
		
		for(String a : list) {
			System.out.println(a);
		}
		
		//Iterator 사용해서 전체 출력하기
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		System.out.println("forEach출력");
		list.forEach(item->System.out.println(item));
	}
}

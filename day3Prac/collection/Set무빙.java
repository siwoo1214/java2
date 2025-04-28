package day3Prac.collection;

import java.util.HashSet;
import java.util.Set;

public class Set무빙 {
	public static void main(String[] args) {
		Set<Moving> list = new HashSet<>();
		
		// set -> 중복된 거 한 개만 저장하고 싶다
		list.add(new Moving("장주원","구룡포",100));
		list.add(new Moving("이미현","경기",80));
		list.add(new Moving("김두식","문산",88));
		list.add(new Moving("장주원","구룡포",120));
		
		for(Moving a : list) {
			System.out.println(a);
		}
		
		// set -> equals,hashcode 
		// set 객체가 동일하게 사용되려면
		// equals, hashcode 오버라이드 해야한다
		// hashcode -> 객체의 일련번호라고 생각하면 된다
	}
}

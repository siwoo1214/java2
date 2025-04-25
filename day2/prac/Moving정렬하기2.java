package day2.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Moving정렬하기2 {
	public static void main(String[] args) {
		ArrayList<Moving> list = new ArrayList<>();
		
		list.add(new Moving("장주원", "구룡포" , 100));
		list.add(new Moving( "이미현"  , "경기" , 80));
		list.add(new Moving("김두식"  ,"문산" , 90));
		list.add(new Moving("전영석", "봉평" , 88));
		
		//Collections.sort(list, new Comparator<Moving>() {});
//		Collections.sort(list, new Comparator<Moving>() {  //익명(람다)함수 사용법
//
//			@Override
//			public int compare(Moving o1, Moving o2) {
//				//return o1.power-o2.power;  //power순으로 오름차순
//				return o2.power-o1.power;  //power순으로 내름차순
//			}});
//		
//		for(Moving a : list){
//			System.out.println(a);
//		}
		for(Moving a : list){
			System.out.println(a);
		}
		System.out.println("정렬 후");
		//람다식 (익명함수) => 익명클래스의 익명객체가 만들어진다
		Collections.sort(list, (m1, m2) -> m1.power-m2.power);
		for(Moving a : list){
			System.out.println(a);
		}
	}
}

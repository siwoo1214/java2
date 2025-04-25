package day1prac.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 객체배열정렬하기 {
	public static void main(String[] args) {
		Acorn[] list = new Acorn[5];
		
		list[0] = new Acorn("ljh","1234",500);
		list[1] = new Acorn("kmh","0000",600);
		list[2] = new Acorn("kym","4321",140);
		list[3] = new Acorn("psk","3456",200);
		list[4] = new Acorn("lsm","7655",790);
		
		for(int i=0; i<list.length; i++) {
			Acorn acorn = list[i];
			System.out.println(acorn);
		}
		
		//정렬하기 포인트순으로
		Arrays.sort(list);
		System.out.println("포인트 순 정렬, 오름차순");
		for(int i=0; i<list.length; i++) {
			Acorn acorn = list[i];
			System.out.println(acorn);
		}
		
		
		//정렬하기 이름순으로
		Arrays.sort(list,new Comparator() {
			public int compare(Object o1,Object o2) {
				Acorn a1 = (Acorn)o1;
				Acorn a2 = (Acorn)o2;
				
				return a1.point-a2.point;
			}
		});
		
		System.out.println("정렬 - 포인트 순");
		for(int i=0; i<list.length; i++) {
			Acorn acorn = list[i];
			System.out.println(acorn);
		}
	}
}

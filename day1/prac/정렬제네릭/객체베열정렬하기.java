package day1.prac.정렬제네릭;

import java.util.Arrays;
import java.util.Comparator;

public class 객체베열정렬하기 {
	public static void main(String[] args) {
		Acorn[] list = new  Acorn[5];
		
		list[0] = new Acorn("ljh","이정호",500);
		list[1]= new Acorn("kmh","김민환",600);
		list[2]= new Acorn("kym","김유민",150);
		list[3]= new Acorn("psk", "박수경",450);
		list[4]= new Acorn("lsm", "이수민",90);
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("------------------------");
		/* 
		 * interface Comparator{
		 * 	  int compareTo(Object o1, Object o2);
		 * }
		 * 
		 * interface Comparator<T>{
		 * 	   int compareTo(T o1, T o2);
		 * }
		 * 
		 */
//		Arrays.sort(list,new Comparator<Acorn>() {   //제네릭은 캐스팅을 안해줘도 된다
//
//			@Override
//			public int compare(Acorn o1, Acorn o2) {
//				return o1.point-o2.point;
//			}
//		});
		
//		Arrays.sort(list, new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				// TODO Auto-generated method stub
//				Acorn a1 = (Acorn)o1;
//				Acorn a2 = (Acorn)o2;
//				return a1.point-a2.point;
//			}
//			
//		});
		
//		for(Acorn acorn : list) {
//			System.out.println(acorn);
//		}
		
		Arrays.sort(list);
		for(Acorn acorn : list) {
			System.out.println(acorn);
		}
		
		//메소드 안에서 클래스를 정의할 수 있다. 지역내부클래스
		class ComoaratorImp implements Comparator<Acorn>{

			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		}
		
		/*
		class ComparatorImp2 implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		*/
		
		//1) 인터페이스 구현방법 - 이름있는 클래스로 작성 하고 객체생성
		Arrays.sort(list,new ComoaratorImp());
		
		
		//2) 익명클래스 작성
		Arrays.sort(list,new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name); //기준문자열이 뒤에 있으면 양수, 기준이 앞에 있으면 음수
			}});
		
		for(Acorn acorn : list) {
		System.out.println(acorn);
	}
	}
}

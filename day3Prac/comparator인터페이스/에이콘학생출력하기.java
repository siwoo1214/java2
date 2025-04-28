package day3Prac.comparator인터페이스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class 에이콘학생출력하기 {
	public static void main(String[] args) {
		ArrayList<Acorn> list = new ArrayList<>();
		
		list.add(new Acorn("test01","1234"));
		list.add(new Acorn("test02","1214"));
		list.add(new Acorn("atest03","9876"));
		
		//정렬하기
		
		//Comparator 인터페이스를 직접 구현 - 이름 있는 클래스, 익명, 람다식
		
		//Comparator.comparing메소드
		Collections.sort(list,new Comparator<Acorn>() {
			@Override
			public int compare(Acorn o1, Acorn o2) { // o1이 기준, o2가 비교
				return o1.getId().compareTo(o2.getId()); //기준이 사전상 뒤에 있으면 양수가 전달됨
		}});
		
		list.forEach(item->System.out.println(item));
		
		//Collections.sort(list,(o1,o2)->{return o1.getName().compareTo(o2.getName());});
		Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
		
		list.forEach(item->System.out.println(item));
		
		//comparing은 static메소드여서 Comparator인터페이스로부터 사용될 때 .을 찍어서 사용하면 된다
		//아래 코드가 어떤 의미냐면 comparing(비교)을 해라 입력값은 Acorn객체 반환값은 String id를 기준으로 정렬
		Collections.sort(list, Comparator.<Acorn,String>comparing(item->item.getId()));
		list.forEach(item->System.out.println(item.getId()));
		
		//에이콘 학생 이름으로 정렬
		//다 드러낼거면 return과 ;를 붙여줘야함
		Collections.sort(list, Comparator.<Acorn,String>comparing((item)->{return item.getId();}));
		list.forEach(item->System.out.println(item.getName()));
		
		//역순으로 출력 .reversed()
		Collections.sort(list,Comparator.<Acorn,String>comparing((item)->{return item.getId();}).reversed());
		//Id 역순으로 출력하기
		System.out.println("아이디 기준 역순으로 출력");
		list.forEach(item->System.out.println(item.getId()+" "+item.getName()));
		
		//람다식 말고 이름 있이 사용하는거
		Collections.sort(list, new Comparator<Acorn>() {
			@Override
			public int compare(Acorn o1, Acorn o2) {
				//return o1.getId().compareTo(o2.getId());
				return o2.getId().compareTo(o1.getId()); //반대로 내림차순 뒤를 기준으로 해서 뒤에서 앞으로 비교해버림
		}});
		System.out.println("아이디 기준 역순으로 출력");
		list.forEach(item->System.out.println(item.getId()+" "+item.getName()));
	}
}

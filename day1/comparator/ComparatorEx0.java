package day1.comparator;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class ComparatorEx0 {
	public static void main(String[] args) {
		
		
		ArrayList<Student> list  = new ArrayList<>();
		
		list.add( new Student("이자바", 3, 300));
		list.add( new Student("김자바", 1, 200));
		list.add( new Student("홍자바", 2, 100));
		list.add( new Student("최자바", 2, 150));
		list.add( new Student("황자바", 1, 200));
		list.add( new Student("문자바", 3, 180));
		list.add( new Student("이자바", 3, 380));
	 
		 
		/////#########
		System.out.println("반으로 정렬하기");
		Collections.sort(list, new Comparator<>() {

			@Override
			public int compare(Student o1, Student o2) {				 
				return  o1.getBan() -o2.getBan();
			}});	      
		
		list.forEach( item  -> System.out.println( item));
		
		
		System.out.println("반으로 정렬하기 람다식");
		Collections.sort(list, (o1, o2) -> o1.getBan() -o2.getBan() ); 
		
		list.forEach( item  -> System.out.println( item));
		
		System.out.println("반으로 정렬하기 - 메서드 참조");
		Collections.sort(list, Comparator.comparing(Student::getBan)); 

		list.forEach(System.out::println);

		
		
		
	    /////#########
		// Comparator인터페이스의 Comparing 매서드 사용하기		
		
		System.out.println("이름으로 정렬하기 인터페이스 익명으로 구현");
		Collections.sort(list, Comparator.comparing( new Function<Student, String>(){

			@Override
			public String apply(Student t) {
				// TODO Auto-generated method stub
				return t.getName();
			}} ));		
		
		list.forEach( System.out::println);
		
		
		
		
		//람다로 사용하기 
		System.out.println("이름으로 정렬하기  람다");
		Collections.sort(list, Comparator.<Student, String>comparing(  item   -> item.getName()  ));		
		list.forEach( System.out::println);
		
		//매서드 참조사요하기
		System.out.println("이름으로 정렬하기  매서드 참조");
		Collections.sort(list, Comparator.<Student, String>comparing(Student::getName));
		list.forEach(System.out::println);

	}
}

 

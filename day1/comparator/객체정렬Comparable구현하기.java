package day1.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparable구현하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student> list  = new ArrayList<>();
		
		list.add( new Student("황예지", 3, 300));
		list.add( new Student("최하은", 1, 200));
		list.add( new Student("김보성", 2, 100));
		list.add( new Student("최지태", 2, 150));
		list.add( new Student("정연수", 1, 200));
		list.add( new Student("박시우", 3, 290));
		list.add( new Student("임형택", 3, 180));
	 
	 
		
		
		// 객체는  Comparable을 구현해야 한다 
		// ㅉ
		
		Collections.sort( list ); 		
		System.out.println(  list);
		
		
		
	

	}

}



//


 
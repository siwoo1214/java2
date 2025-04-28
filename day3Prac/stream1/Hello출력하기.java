package day3Prac.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello출력하기 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("hello");
		list.add("hello");		
		list.add("bye");
		list.add("hello");
		
		//스트림으로 얻어오기
		//1.모든요소 출력하기
		Stream<String> stream = list.stream();
		
		//forEach(); -> 최종연산
		stream.forEach(item->System.out.println(item));
		
		//2.hello만 출력하기
		stream = list.stream();
		System.err.println("hello만 출력");
		stream.filter(str->str.equals("hello")).forEach(str->System.out.println(str));
		//위에가 이걸 생략한거 stream.filter((str)->{return str.equals("hello");}).forEach(item->System.out.println(item));
		//순서는 filter를 걸어준 다음에 foreach로 반복출력
		
		System.err.println("hi만 출력하기");
		stream = list.stream();
		stream.filter(new Predicate<String> () {
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.equals("hi");
			}
		}).forEach(item->System.out.println(item));
		
		//3.hello에서 2개만 출력하기  .limit(몇개)
		System.err.println("n개만 출력하기");
		stream = list.stream();
		stream.filter(str->str.equals("hello")).limit(2).forEach(str->System.out.print(str+" "));
		
		//4.hello만 List로 만들기
		System.err.println("\nhello만 List로 빼서 출력하기");
		stream = list.stream();
		List<String> helloList = stream.filter(str->str.equals("hello")).collect(Collectors.toList());
		helloList.forEach(str -> System.out.print(str+" "));
	}
}

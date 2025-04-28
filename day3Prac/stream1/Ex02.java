package day3Prac.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		//객체 배열
		String[] arr = new String[5];
		arr[0] = "hi";
		arr[1] = "bon jour";
		arr[2] = "gonnichiwa";
		arr[3] = "gutentak";
		arr[4] = "annyeonghaseto";
		
		Arrays.sort(arr);
		for(String a : arr) {
			System.out.println(a);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("bon jour");
		list.add("gonnichiwa");
		list.add("gutentak");
		list.add("annyeonghaseto");
		
		//ArrayList정렬 -> Collections.sort
		Collections.sort(list);
		for(String a : list) {
			System.out.println(a);
		}
		
		//객체배열을 stream로 변환하기
		//Stream.of(배열)
		// 1)스트림으로 얻어오기
		Stream<String> stream = Stream.of(arr);
		
		// 2)0~n번의 중간연산
		// 3)최종연산 1번 (사용이 끝난 스트림이 종료됨, 재사용 불가, 다시 얻어와야함)
		System.err.println("stream으로 정렬하고 출력하기");
		stream.sorted().forEach(item->System.out.println(item));
		
		
		Stream<String> stream2 = list.stream();
		stream2.sorted().forEach(item->System.out.println(item));  //람다식 더 줄인거 => 메소드 참조
		//stream.sorted().forEach(System.out::println);  //-> 이게 메소드 참조임 그냥 다 줄여버린거
		
		stream2 = list.stream();   //()->{}
		stream2.sorted().forEach((item)->{System.out.println(item);});
		
		
		
	}
}

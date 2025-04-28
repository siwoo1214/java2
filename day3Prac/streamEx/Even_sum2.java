package day3Prac.streamEx;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Even_sum2 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Random rd = new Random();
		int sum1=0;
		
		for(int i=0; i<30; i++) {
			set.add(rd.nextInt(100)+1);
		}

		Stream<Integer> setStream = set.stream();
		
		System.out.println("스트림 변환");
		
		List<Integer> list = setStream
		.limit(10)
		.filter(item->item%2==0)
		.collect(Collectors.toList());
		
		for(Integer a : list) {
			System.out.println(a);
			sum1+=a;
		};
		
		System.out.println("합계 : "+sum1);
	}
}

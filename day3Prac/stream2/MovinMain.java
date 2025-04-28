package day3Prac.stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class MovinMain {
	public static void main(String[] args) {
		ArrayList<Moving> list = new ArrayList<>();
		list.add( new Moving("장주원" ,"구룡포",100));
		list.add( new Moving("이미현" ,"경기",80));
		list.add( new Moving("김두식" ,"문산",88));
		list.add( new Moving("장주원" ,"구룡포",120));
		
		//stream으로 얻어와서 출력하기
		System.err.println("stream으로 얻어와서 출력하기");
		Stream<Moving> stream = list.stream();
		stream.forEach(item->System.out.print(item.getName()+" "));
		
		//stream으로 얻어와서 요소 개수 구하기
		System.err.println("\nstream으로 얻어와서 요소 개수 구하기");
		stream = list.stream();
		long count = stream.count();
		System.out.println(count);
		
		//stream으로 얻어와서 파워가 80이상인 요소 개수 출력하기
		System.err.println("\nstream으로 얻어와서 파워가 80이상인 요소 개수 출력하기");
		stream = list.stream();
		long count2 = stream.filter(item->item.getPower()>90).count();
		System.out.println(count2);
		
		//stream으로 얻어와서 파워가 90이상인 요소만 출력하기
		System.err.println("\nstream으로 얻어와서 파워가 80이상인 요소만 출력하기");
		stream=list.stream();
		stream.filter(item->item.getPower()>=90).forEach(item->System.out.println(item));
		
		//strean으로 얻어와서 정렬하고 출력하기 (파워 순으로)
		System.err.println("\nstream으로 얻어와서 정렬하고 출력하기 (파워 순으로 오름차순)");
		stream=list.stream();
		stream.sorted((o1,o2)->o1.getPower() - o2.getPower()).forEach(item->System.out.println(item+" "));
		
		//strean으로 얻어와서 정렬하고 출력하기 (파워 순으로 내림차순)
		System.err.println("\nstream으로 얻어와서 정렬하고 출력하기 (파워 순으로 내림차순)");
		stream=list.stream();
		stream.sorted((o1,o2)->o2.getPower() - o1.getPower()).forEach(item->System.out.println(item+" "));
		
		//
		System.err.println("\nMoving요원들의 이름순 정렬");
		stream = list.stream();
		stream.sorted(Comparator.<Moving,String>comparing((item)->{return item.getName(); }))
		.forEach(item->System.out.println(item));;
		
	}
}

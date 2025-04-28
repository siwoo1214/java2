package day3.stream.맛보기;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> list1  = new ArrayList<>();
		list1.add("딸기");
		list1.add("딸기");
		list1.add("딸기");
		list1.add("포도");
		
		
		
		Stream<String>  stream = list1.stream(); 
		List<String > li= stream.sorted().filter( item -> item.equals("딸기")).collect( Collectors.toList());
		 
		System.out.println(li);

	}

}

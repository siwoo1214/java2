package day3.stream.맛보기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 
 

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<Book> set  = new ArrayList<>();
		set.add( new Book("이것이자바다", 25000) );
		set.add( new Book("이것이자바다", 23000) );
		set.add( new Book("이것이자바다", 26000) );
		set.add( new Book("이것이자바다", 25000) );
		set.add( new Book("이것이자바다", 25000) );
		
		
		 Stream<Book> stream = set.stream();
	  
		
		 stream.sorted( (o1,o2) -> o1.getPrice() -o2.getPrice()).forEach( t -> System.out.println(t));
		 
		 
		
		//List<Book>d =stream.sorted( Comparator.<Book, Integer>comparing(  item -> item.getPrice() )).collect( Collectors.toList()); 

		
		//System.out.println(d);
	}

}

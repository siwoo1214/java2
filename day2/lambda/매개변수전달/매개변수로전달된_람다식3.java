package day2.lambda.매개변수전달;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 매개변수로전달된_람다식3 {

	public static void main(String[] args) {
		 
		
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("박예린");
		list.add("이정호");
		list.add("김민환");
		list.add("김유민");
		
		
		
		// 매개변수로 Consumer인터페이스를 구현한 객체를 제공해야 한다 
		list.forEach(  new Consumer< String> () {

			@Override
			public void accept(String t) {
				  System.out.println( t);
				
			}}); 
		
		
		//함수형인터페이스라면  람다식으로 
		list.forEach( t -> System.out.println( t));
		
	 
		
	}

}

package day2.lambda.consumer;



// Consumer 인터페이스 활용예 

import java.util.ArrayList;
import java.util.function.Consumer;

  class AcornConsumerImp implements Consumer<Acorn> {

    @Override
    public void accept(Acorn t) {
        System.out.println(t);  // Acorn 객체 출력
    }
}


public class ArrayList출력하기 {

	public static void main(String[] args) {
       ArrayList<Acorn> list  = new ArrayList<>();
		
		
		list.add( new Acorn( "acorn1", "0000", "권지언"));
		list.add( new Acorn( "acorn2", "1234", "이동우"));
		list.add( new Acorn( "acorn3", "3456", "오윤석"));
		list.add( new Acorn( "acorn4", "1234", "윤현기"));
		list.add( new Acorn( "acorn5", "5678", "임형택"));
		list.add( new Acorn( "acorn6", "1090", "이수민"));
		list.add( new Acorn( "acorn7", "0000", "박수경"));
		list.add( new Acorn( "acorn8", "0000", "김유민"));
		list.add( new Acorn( "acorn9", "1234", "김민환"));
	 
	 
		
		// list.forEach(  매개변수로 인터페이스  );  
		// list.반복하기(   반복할 코드 );
		// 반복할코드는 모두가 다르다 
		// 반복할코드까지 미리 라이브러리로 만들 수는 없다.
		// 각자가 구현하게 끔 만들어 두었다 !!
		// 약속(인터페이스)
		
		
		
		//인터페이스를 이름있는 클래스로 구현하기 		
		System.out.println("for each  반복하기0");
		list.forEach( new AcornConsumerImp());
		
		
		
		//인터페이스를 익명으로 구현
		System.out.println("for each  반복하기1");
		list.forEach( new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				    System.out.println( t);
				
			}});
		
		
	
		//인터페이스를  람다식으로 
		System.out.println("for each  반복하기2");
		list.forEach(  item  -> System.out.println( item.getName()));
		
		
		//람다식을 매서드 참조형으로 
		
		System.out.println("for each  반복하기3");
		list.forEach(  System.out::println);
		
		
}

}

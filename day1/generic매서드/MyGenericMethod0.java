package day1.generic매서드;

public class MyGenericMethod0 {
	//  제네릭 메소드
	//  T : 타입변수. 원하는 어떤 이름으로든 명명 가능	
	 
	public static <T> void print(T a) {
		 System.out.println( a);
	}
	  
	 
	public static void main(String[] args) {
		
		
		//매서드를 호출할 때마다 타입을 대입하 수 있다 ( 생략가능)
		MyGenericMethod0.<Integer>print(3);
		MyGenericMethod0.<String>print("hello");
		MyGenericMethod0.<Double>print(3.5);
		MyGenericMethod0.<Character>print('C');
		MyGenericMethod0.<Score>print( new Score("홍길동"));
		
		 
		
		//
		
		MyGenericMethod0.print(3);
		MyGenericMethod0.print("hello");
		MyGenericMethod0.print(3.5);
		MyGenericMethod0.print('C');
		MyGenericMethod0.print( new Score("홍길동"));
		
		
        
        
	}

	
	
}

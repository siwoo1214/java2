package day2Prac.함수형인터페이스;

// 램덤 별찍기
interface AddInterface{
	String add(String star);
}


// 1. 이름있는 클래스
public class 이동우_실습 {

	
	public static void main(String[] args) {
		
		
		
		// 1. 이름 있는 클래스
		System.out.print("1. 이름 있이!! : ");
		class A implements AddInterface{
			@Override
			public String add(String star) {
				StringBuilder s = new StringBuilder();
				int count = (int)(Math.random()*10)+1;
				for(int i = 1; i <= count; i++) {
					s.append(star);
				}
				return s.toString();
				
			}

		}
		
		A a = new A();
		String star = a.add("*");
		System.out.println(star);
		
		
		

		//2. 익명 클래스
		System.out.print("2.   익명!!   : ");
		AddInterface a2 = new AddInterface() {

			@Override
			public String add(String star) {
				
				StringBuilder s = new StringBuilder();
				int count = (int)(Math.random()*10)+1;
				for(int i = 1; i <= count; i++) {
					s.append(star);
				}
				return s.toString();
			}};
			
			String star1 = a2.add("*");
			System.out.println(star1);
			
			
			
			// 3. 람다식
			System.out.print("3.땡큐 람다식!! : "
					+ "");
			AddInterface a3 = (star2) ->{
				StringBuilder s = new StringBuilder();
				int count = (int)(Math.random()*10)+1;
				for(int i = 1; i <= count; i++) {
					s.append(star2);
				}
				return s.toString();
			};
			
			
			String star2 = a3.add("*");
			System.out.println(star2);
			
	}
	
	
		
	
	
	
	
}

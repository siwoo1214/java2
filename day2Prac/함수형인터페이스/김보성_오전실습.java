package day2Prac.함수형인터페이스;

interface NumInterface {
	int num(int x, int y);
}


public class 김보성_오전실습 {
	
	public static void main(String[] args) {

		class add implements NumInterface{
			@Override
			public int num(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		}
		
		class minus implements NumInterface{
			@Override
			public int num(int x, int y) {			
				return x-y;
			}
		}
		
		// 클래스로 실행하기
		add a1 = new add();
		int aresult = a1.num(4, 5);
		System.out.println(aresult);
		
		minus m1 = new minus();
		int mresult = m1.num(10, 3);
		System.out.println(mresult);
		                                                                                                                                            
		
		// 익명객체로 실행하기
		NumInterface a2 = new NumInterface() {
			@Override
			public int num(int x, int y) {
				return x + y;
			}};
			
		int aresult2 = a2.num(4, 5);
		System.out.println(aresult2);

		NumInterface m2 = new NumInterface() {
			@Override
			public int num(int x, int y) {
				
				return x - y;
			}};
		int mresult2 = m2.num(12, 8);
		System.out.println(mresult2);
		
		// 람다식으로 만들고 실행하기
		// () -> {}
		
		/*
		MyRunnable r3 = ()->{System.out.println("lamda ");};
		r3.run();
		*/
		
		NumInterface a3 = (x, y) -> x + y;
		int aresult3 = a3.num(12, 13);
		System.out.println(aresult3);
		
		NumInterface m3 = (x,y) -> x-y;
		int mresult3 = m3.num(18, 4);
		System.out.println(mresult3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

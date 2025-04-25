package day2Prac.함수형인터페이스;

public class MyRunnable인터페이스구현 {
	public static void main(String[] args) {
		//1. 인터페이스 구현한 클래스로 호출하기
		박시우 park = new 박시우();
		park.run();
		
		MyRunnable r = park;
		r.run();
		
		//2. 익명클래스
		MyRunnable r2 = new MyRunnable() {
			@Override
			public void run() {
				System.out.println("익명 구현 run...");
			}};
		r2.run();
		
		//3. 람다식
		MyRunnable r3 = ()->{System.out.println("Lambda run !!!");};
		r3.run();
	}
}

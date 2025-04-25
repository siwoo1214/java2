package day1prac.라이브러리만들기;

public class PswLib {
	public static void main(String[] args) {
		TestLib t = new TestLib();
		t.printStar();
		System.out.println();
		t.printChar('a');
		System.out.println();
		t.runCode(new 코드() {  //람다함수로 인터페이스의 메소드를 구현하는 모습임
			@Override
			public void run() {
				System.out.println("hi run ");
			}
		});
		
		t.runCode(new AAA());
	}
}

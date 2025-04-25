package day1prac.라이브러리만들기;

// 1.별 3개 출력
// 2.특정문자를 3번 출력하는 기능  char -> 'ㅁ';
// 3.당신의 코드를 3번 실행하는 기능 -> 인터페이스활용
public class TestLib {
	void printStar() {
		System.out.print("* * *");
	}
	
	void printChar(char a) {
		System.out.printf("%c %c %c",a,a,a);
	}
	
	//라이브러리를 제공할 때
	//결정할 수 없는 코드가 생긴다 => 인터페이스 활용함
	//이 인터페이스는 라이브러리 만든사람이 만든다
	//interface 코드 { void run(); }
	public void runCode(코드 code) {
		for(int i=0; i<3; i++) {
			//System.out.println(i);
			code.run();
		}
	}
}

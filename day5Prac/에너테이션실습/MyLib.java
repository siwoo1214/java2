package day5Prac.에너테이션실습;

public class MyLib {
	
	@Before(before="매소드 실행 시작합니다")
	public void printStar() {
		System.out.println("***");
	}
	
	@Before
	public void printStar2(int num) {
		for(int i=0; i<num; i++) {
			System.out.println("***");
		}
	}
}

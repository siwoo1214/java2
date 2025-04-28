package day3Prac.comparator인터페이스;

public class A요리사 implements 한식요리가가능한{
	@Override
	public void 구절판만들기() {
		System.out.println("나만의 불고기전골 레시피");
	}
	
	@Override
	public void 불고기전골만들기() {
		System.out.println("나만의 구절판 레시피");
	}
	
	@Override
	public void 김치만들기() {
		System.out.println("나만의 배추김치 레시피");
	}
}

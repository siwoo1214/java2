package day1.인터페이스_static_default;

public class 실습_static_default {

	public static void main(String[] args) {
		
		
		//한식요리가능한.김치만두만들기s();
		
		
		
		// 객체를 생성한 이후 사용가능
		// 필요하면 오버라이드 가능 
		
		C요리사 요리사 = new C요리사();
		
		요리사.구절판만들기();
		요리사.불고기전골만들기();
		요리사.김치만두만들기();    //  default 매서드 
		
		
		//static  매서드 사용하기
		한식요리가능한.김치만두만들기s();
		
	}

}

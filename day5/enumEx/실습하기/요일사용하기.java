package day5.enumEx.실습하기;

public class 요일사용하기 {

	public static void main(String[] args) {
		 
		//0:일,  1:월 ....  토:6		
		int day=1;  //요일정보 
		
		//요일정보 
		int day2= DAY.MONDAY;     //가독성이 높아진다
		//day2 =100;   //          요일 정보가 아닌 다른 값이 들어가는 것을  막을 수 없다 
		
		 
		//enum ( 일요일 ~ 토요일 요일정보를 나타내도록 하자!!)		
		DAY2 day3  =DAY2.MONDAY;
		//day3 =10; 
		 
		
		System.out.println(  day);
		System.out.println(  day2);
		System.out.println(  day3);
		 
		
		 System.out.println( "DAY2  enum  내용 확인하기");
		 for( DAY2 d  : DAY2.values()) {
			 System.out.println( d);
		 }
		
		
	}

}

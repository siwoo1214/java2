package day5Prac.enum실습하기;

public class MonitorMain {
	public static void main(String[] args) {
		
		Moniter moniter1 = new Moniter("와이드 모니터","DARK","삼성");
		Moniter moniter2 = new Moniter("소형 모니터","LIGHT","LG");
		Moniter moniter3 = new Moniter("중형 모니터","YELLO","삼성");
		
		System.out.println(moniter1);
		System.out.println(moniter2);
		System.out.println(moniter3);
		
		
	}
}

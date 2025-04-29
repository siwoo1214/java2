package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program4 {
	// 계산기 클래스가 변경되도 작동되도록  -> KakaoCalculator
	// 메소드 또한 다 바꿔줘야한다 불편한 부분이 있다
	KakaoCalculator cal = new KakaoCalculator();
	
	public void run() {
		System.out.println("계산기 프로그램 시작 !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요 계산해드리오리다...ver2");
		
		int su1,su2;
		su1=sc.nextInt();
		su2=sc.nextInt();
		
		int total = cal.addKakao(su1, su2);
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		Program4 p = new Program4();
		p.run();
	}
}

package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program7 {
	// 직접 생성하지 않고 외부에서 생성된 계산기 객체 주입받기
	Calculator calculator;

	// 세터 주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void run() {
		System.out.println("프로그램 시작 ver7");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해 더해줄게");
		int su = sc.nextInt();
		int su2 = sc.nextInt();
		
		int total = calculator.add(su, su2);
		System.out.println(total);
	}

	public static void main(String[] args) {
		Program7 p = new Program7();
		// 이런식으로 객체를 주입(set)해줘야함
		p.setCalculator(new B());
		p.run();
	}
}

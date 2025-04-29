package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program5 {
	Calculator calculator = new A();
	
	public void run() {
		System.out.println("프로그램 시작 !~! ver5");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력해 더해줄게");
		int su = sc.nextInt();
		int su2 = sc.nextInt();
		
		int total = calculator.add(su, su2);
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		Program5 p5 = new Program5();
		p5.run();
	}
}

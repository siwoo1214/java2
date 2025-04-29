package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program2 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요 계산해드리오리다...ver2");
		
		int su1,su2;
		su1=sc.nextInt();
		su2=sc.nextInt();
		
		int total;
		AcornCalculator cal = new AcornCalculator();
		total=cal.add(su1, su2);
		
		System.out.println("두 수의 합은 "+total);
		sc.close();
	}
}

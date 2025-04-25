package day2Prac.함수형인터페이스;

import java.util.Scanner;

interface interPrac{
	void translate(String name);
}

public class 박시우_실습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문 이름을 입력해주세요 : ");
		String name = sc.next();
		
		//이름있는거
		class A implements interPrac{
			
			@Override
			public void translate(String name) {
				System.out.println("--------클래스 만든거--------");
				System.out.println("당신의 영문이름을 숫자로하면 ");
				for(int i=0; i<name.length(); i++) {
					char ch = name.charAt(i);
					int num = (int)ch;
					System.out.print(num+" ");
				}
				System.out.println("입니다");
			}
		}
		
		A a = new A();
		a.translate(name);
		
		
		//익명클래스
		interPrac ip = new interPrac() {

			@Override
			public void translate(String name) {
				System.out.println("--------익명클래스--------");
				System.out.println("당신의 영문이름을 숫자로하면 ");
				for(int i=0; i<name.length(); i++) {
					char ch = name.charAt(i);
					int num = (int)ch;
					System.out.print(num+" ");
				}
				System.out.println("입니다");
			}};
		
		ip.translate(name);
		
		
		
		//람다식
		interPrac ip2 = (yourName)->{
			System.out.println("--------람다식 사용--------");
			System.out.println("당신의 영문이름을 숫자로하면 ");
			for(int i=0; i<name.length(); i++) {
				char ch = name.charAt(i);
				int num = (int)ch;
				System.out.print(num+" ");
			}
			System.out.println("입니다");
		};
		
		ip2.translate(name);
	}
}

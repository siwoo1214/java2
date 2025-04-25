package day2Prac.함수형인터페이스2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 최하은_오후실습 {

	public static void main(String[] args) {
		
		//1.Runnable : (입력 x 반환 x)
		System.out.println("나의 버킷리스트는?");
		Runnable bucket  = () -> {
			System.out.println("부~자 되고 싶어요~");
		};
		bucket.run();
		
		//2.Consumer : (입력 o 반환 x)
		Consumer<Integer> shop = (money) -> {
			System.out.println("꼬기요리 장보기");
			
			ArrayList<String> list = new ArrayList<>();
			list.add("스테이크용 소고기 : 15,800");
			money -=  15800;
			list.add("트러플 오일 : 9,500");
			money -=  9500;
			list.add("허브 솔트 : 3,500");
			money -= 3500;
			list.forEach((item) -> {System.out.println(item + "원");});
			
			int total = 15800 + 9500 + 3500;
			
			System.out.println("사용 금액 : " + total + "원");
			System.out.println("남은 금액 : " + money + "원");
		
		}; 
		shop.accept(30000);
		
		//3.Supplier : (입력 x 반환 o)
		Supplier<String> cook = () -> {
			System.out.println("요리 시작하기~");
			return "스테끼";
		};
		String dish = cook.get();
		System.out.println("프라이팬 준비!");
		System.out.println("프라이팬에 기름을 바르고~");
		System.out.println("장 봐온 꼬기를 올리고");
		System.out.println("타지 않게 잘 봐주면서");
		System.out.println("기다리면 끝~!");
		System.out.println("'" + dish + "'" + "완성");
		
		//4.Predicate : (입력 o 반환 o)
		System.out.println("너! 스테이크 했지?!!");
		Predicate<String> food = (ans) -> {
			if(ans.equals(dish)) {
				return true;
			}else {
				return false;
			}
		};
		boolean answer = food.test("스테끼");
		if(answer) {
			System.out.println("웅 마쟈~ 정답!");
		}else {
			System.out.println("땡!!!");
		}
		
		//5.Function : (입력 o 반환 o)
		System.out.println("수의 제곱수는?");
		Function<Integer, Integer> square = (num) -> {return num * num;};
		int result = square.apply(6);
		System.out.println(result);
		
		System.out.println("범위 안에 랜덤 수~");
		Function<Integer, Integer> ramdom = (su) -> {return (int)(Math.random()*su) + 1;};
		int result2 = ramdom.apply(10);
		System.out.println(result2);
		
	}
	
}

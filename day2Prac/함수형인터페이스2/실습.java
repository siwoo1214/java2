package day2Prac.함수형인터페이스2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 실습 {
	public static void main(String[] args) {
		int total = 30000;
		int beef = 8000,Lasagna_noodles = 4500,tomato_sauce = 3600,
				mozzarella=5600,olive_oil=8200;
		
		//Runnable
		Runnable r = ()->{
			ArrayList<String> list = new ArrayList<>();
			list.add("알프스 산맥에서 보드타기");
			list.add("북극 탐험 다녀오기");
			list.add("정글 탐험");
			list.add("백악관 가서 트럼프랑 악수하기");
			System.out.println("✈️나의 버킷리스트✈️");
			for(int i=0; i<list.size(); i++) {
				if(i==list.size()-1) {
					System.out.println((i+1)+". "+list.get(i)+"\n");
				}else {
					System.out.println((i+1)+". "+list.get(i));
				}
				
			}
		};
		r.run();
		
		//라자냐 재료
		//갈은 소고기 : 8000원
		//라자냐 면 : 4500원
		//토마토 스파게티 소스 : 5600원
		//모짜렐라 치즈 : 7600원
		//올리브 오일 : 10200원
		//Consumer
		Consumer<Integer> c = (budget)->{
			budget-=beef;
			System.out.println("간 소고기 샀고");
			budget-=Lasagna_noodles;
			System.out.println("라자냐 면 샀고");
			budget-=tomato_sauce;
			System.out.println("토마토 소스 샀고");
			budget-=mozzarella;
			System.out.println("짜짜렐라 치즈 샀고");
			budget-=olive_oil;
			System.out.println("올리브 오일까지 사서");
			System.out.println("남은 금액은 "+budget+"원 이네요\n");
		};
		c.accept(total);
		
		
		//Supplier
		Supplier<String> s = ()->{
			System.out.println("Step 1"
					+ "\r\n"
					+ "당근, 셀러리, 양파는 잘게 다져주세요. 마늘은 편 썰어주세요.\r\n");
			System.out.println("Step 2"
					+ "\r\n"
					+ "달군 팬에 올리브오일을 두른 후 당근, 셀러리, 양파를 넣어 볶아주세요. 볶은 야채는 접시에 덜어주세요.\r\n");
			System.out.println("Step 3"
					+ "\r\n"
					+ "야채를 볶은 팬에 올리브오일을 두른 후 마늘을 넣어 볶다가 간 소고기를 넣고 소금, 후추를 뿌려 바싹 볶아주세요.\r\n");
			System.out.println("Step 4"
					+ "\r\n"
					+ "고기가 다 익으면 볶아둔 야채와 건 바질, 토마토소스를 넣어 볶아주세요.\r\n");
			System.out.println("Step 5"
					+ "\r\n"
					+ "우유를 조금씩 넣어가며 30분 정도 끓여 라구소스를 완성해 주세요.\r\n");
			System.out.println("Step 6"
					+ "\r\n"
					+ "라자냐 그릇에 완성된 소스를 1~2큰술 정도 펼친 후 라자냐를 깔고 그 위에 라구소스-라자냐-슈레드 치즈- 파마산 치즈 순서대로 층층이 쌓은 후 종이호일을 덮어주세요.\r\n"
					+ "(tip. 가로 25cm 세로 17cm 높이 4cm 법랑 용기를 사용했어요)\r\n");
			System.out.println("Step 7"
					+ "\r\n"
					+ "200도로 예열한 오븐에서 약 20분간 굽고 종이호일을 벗기고 5분 정도 더 구워 주세요.\r\n"
					+ "(tip. 10분 정도 식혀두었다가 썰어주세요)\r\n");
			System.out.println("Step 8"
					+ "\r\n"
					+ "Enjoy it.");
			System.out.print("내가 만든 음식 : ");
			return "lasagna\r\n";
		};
		
		String lasagna=s.get();
		System.out.println(lasagna);
		
		//Predicate
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 음식을 만들었을까요 ?? ");
		String whatiCooked = sc.next();
		
		Predicate<String> p = (whatiCooked_p)->{
			return whatiCooked_p.equals("lasagna")?true:false;
		};
		System.out.println(p.test(whatiCooked));
		
		
		//Function
		System.out.print("영문 이름을 입력하세요 : ");
		String yourName = sc.next();
		
		Function<String, Integer> f = (name)->{
			System.out.println("당신의 영문 이름은 숫자로 ");
			for(int i=0; i<name.length(); i++) {
				int num = (int)name.charAt(i);
				System.out.print(num+" ");
			}
			System.out.println("입니다.");
			return 0;
		};
		
		f.apply(yourName);
	}
}

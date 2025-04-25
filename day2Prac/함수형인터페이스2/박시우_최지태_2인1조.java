package day2Prac.함수형인터페이스2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class 박시우_최지태_2인1조 {
	public static void main(String[] args) {
		장보기 c = new 장보기();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.물품구매 2.장바구니 조회 3.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("구매할 물품 이름을 적어주세요 : ");
				String name = sc.next();
				System.out.print("구매할 물품 가격을 적어주세요 : ");
				int price = sc.nextInt();
				System.out.print("구매할 물품 개수를 적어주세요 : ");
				int cnt = sc.nextInt();
				c.accept(new 상품(name,price,cnt));
				break;
			case 2:
				c.showList();
				break;
			case 3:
				System.out.println("총 구매한 상품목록");
				c.showList();
				return;
			}
		}
	}

}

class 장보기 implements Consumer<상품> {
	private ArrayList<상품> list;
	private int money;

	public 장보기() {
		this.list = new ArrayList<>();
		this.money = 30000;
	}

	private boolean checkMoney(int price) {
		return this.money - price >= 0 ? true : false;
	}
	
	public void showList() {
		System.out.println("장바구니");
		System.out.println("========================");
		for(상품 item : this.list) {
			System.out.println(item);
		}
		System.out.println("========================");
		System.out.println("남은 금액 : " + this.money);
	}

	@Override
	public void accept(상품 t) {
		if(checkMoney(t.getPrice() * t.getCnt())) {
			this.list.add(t);
			this.money-=t.getPrice() * t.getCnt();
			System.out.println(t.getName() + "을(를) 추가하였습니다.");			
		} else {
			System.out.println("보유한 잔액이 없습니다.");
		}
	}
}

class 상품 {
	private String name;
	private int price;
	private int cnt;

	public 상품(String name, int price, int cnt) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "상품 [name=" + name + ", price=" + price + ", cnt=" + cnt + "]";
	}

}
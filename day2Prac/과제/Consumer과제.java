package day02prac.과제;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer과제 {
	public static void main(String[] args) {
		장보기 c = new 장보기();
		c.accept(new 상품("과자", 1000, 2));
		c.accept(new 상품("라면", 1500, 5));
		c.accept(new 상품("치킨", 23000, 1));
		c.accept(new 상품("피자", 40000, 1));
		c.showList();
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
		return this.money - price > 0 ? true : false;
	}
	
	public void showList() {
		System.out.println("장본거 리스트");
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
			System.out.println(t.getName() + "을(를) 추가하였습니다.");			
		} else {
			System.out.println("돈이 없습니다.");
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
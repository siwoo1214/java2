package day2Prac.과제;

import java.util.ArrayList;

public class Runnable과제 {
	public static void main(String[] args) {
		버킷리스트 r = new 버킷리스트("구글입사", "네이버 입사", "카카오 입사", "쿠팡 입사", "배달의민족 입사", "라인 입사");
		r.run();
	}

}

class 버킷리스트 implements Runnable {
	private ArrayList<String> list;

	public 버킷리스트(String... list) {
		this.list = new ArrayList<>();

		for (String item : list) {
			this.list.add(item);
		}
	}

	@Override
	public void run() {
		System.out.println("내 버킷리스트");
		System.out.println("========================");
		for (int i = 0; i < this.list.size(); i++) {
			System.out.println((i + 1) + "번 " + this.list.get(i));
		}
		System.out.println("========================");
	}
}
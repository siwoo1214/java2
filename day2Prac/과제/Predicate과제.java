package day2Prac.과제;

import java.util.function.Predicate;

public class Predicate과제 {
	public static void main(String[] args) {
		내껀가 p = new 내껀가();
		System.out.println(p.test("치킨"));
		System.out.println(p.test("피자"));
		
	}

}

class 내껀가 implements Predicate<String> {
	String[] list = { "게살버거", "제육", "햄부기", "게살피자", "치킨" };

	@Override
	public boolean test(String t) {
		for (String item : list) {
			if (item.equals(t))
				return true;
		}
		return false;
	}
}
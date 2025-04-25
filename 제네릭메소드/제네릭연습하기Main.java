package 제네릭메소드;

public class 제네릭연습하기Main {
	public static void main(String[] args) {
		int result = 제네릭메소드연습.선택하기int(4,7);
		System.out.println(result);
		
		String result2 = 제네릭메소드연습.선택하기String("messi", "ronaldo");
		System.out.println(result2);
		
		boolean result3 = 제네릭메소드연습.선택하기boolean(true, false);
		System.out.println(result3);
	}
}

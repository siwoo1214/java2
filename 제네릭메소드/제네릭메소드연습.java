package 제네릭메소드;

public class 제네릭메소드연습 {
	public static int 선택하기int(int a, int b) {
		double r = Math.random();  //0~1의 난수
		return r>0.5?a:b;
	}
	
	public static String 선택하기String(String a, String b) {
		double r = Math.random();
		return r>0.5?a:b;
	}
	
	public static boolean 선택하기boolean(boolean a, boolean b) {
		double r = Math.random();
		return r>0.5?a:b;
	}
}

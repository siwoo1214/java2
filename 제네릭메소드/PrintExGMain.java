package 제네릭메소드;

public class PrintExGMain {
	public static void main(String[] args) {
		PrintExG.<Integer>print(10);
		PrintExG.<Acorn>print(new Acorn("kym","김유민",123));
		PrintExG.<String>print("집에 가고 싶습니다");
		
		
	}
}

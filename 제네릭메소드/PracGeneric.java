package 제네릭메소드;

public class PracGeneric {
	public static <T> void whatis(T val){
		System.out.println(val);
	}
	
	public static <T> boolean areTheySame(T str1, T str2) {
		return str1.equals(str2);
	}
	
	public static <T> T randomSelection(T val1, T val2) {
		double a = Math.random();
		return a>0.5?val1:val2;
	}
	
	public static void main(String[] args) {
		PracGeneric.whatis("안녕하세요");
		PracGeneric.whatis(123123);
		PracGeneric.whatis(true);
		PracGeneric.whatis(new Acorn("qwer","박시우",1234));
		
		System.out.println("--------------------------------");
		
		System.out.println(PracGeneric.<String>areTheySame("asd", "asd"));
		System.out.println(PracGeneric.<String>areTheySame("asd", "asdf"));
		System.out.println(PracGeneric.<Integer>areTheySame(3, 3));
		System.out.println(PracGeneric.<Integer>areTheySame(3, 4));
		
		System.out.println("--------------------------------");
		
		System.out.println(PracGeneric.randomSelection("Nike", "Adidas"));
		System.out.println(PracGeneric.randomSelection(777, 444));
		System.out.println(PracGeneric.randomSelection('q', 'p'));
	}
}

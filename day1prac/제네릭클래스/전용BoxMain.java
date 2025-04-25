package day1prac.제네릭클래스;

public class 전용BoxMain {
	public static void main(String[] args) {
		BoxInteger box1 = new BoxInteger();
		box1.setItem(777);   //444 -> Integer객체로 만들어줌 auto Boxing
		int result = box1.getItem();
		System.out.println(result);
		
		BoxString box2 = new BoxString();
		box2.setItem("문자열 전용");
		String result2 = box2.getItem();
		System.out.println(result2);
		
		BoxAcorn box3 = new BoxAcorn();
		box3.setItem(new Acorn("psw","박시우"));
		Acorn result3 = box3.getItem();
		System.out.println(result3);
		
		BoxG<Integer> gbox1 = new BoxG<>();
		gbox1.setItem(1010);
		int gresult = gbox1.getItem();
		System.out.println(gresult);
		
		BoxG<String> gbox2 = new BoxG<>();
		gbox2.setItem("집에 가고싶습니다");
		String gresult2 = gbox2.getItem();
		System.out.println(gresult2);
		
		BoxG<Acorn> gbox3 = new BoxG<>();
		gbox3.setItem(new Acorn("ldw","이동우"));
		Acorn gresult3 = gbox3.getItem();
		System.out.println(gresult3);
	}
}

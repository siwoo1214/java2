package day1prac.제네릭클래스;

public class BoxGMain {
	public static void main(String[] args) {
		BoxG<String> box = new BoxG<>();
		box.setItem("문자열만 담기네요");
		//box.setItem(new Acorn());
		
		String item = box.getItem();
		System.out.println(item);
		
		BoxG<Acorn> box2 = new BoxG<>();  //제네릭 타입선언
		box2.setItem(new Acorn("kmh","김만환"));
		Acorn a = box2.getItem();
		System.out.println(a);
	}
}

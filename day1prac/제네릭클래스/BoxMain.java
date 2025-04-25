package day1prac.제네릭클래스;

public class BoxMain {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setItem("문자열담기");
		String item = (String)box.getItem();
		
		System.out.println(item);
		
		Box box2 = new Box();
		box2.setItem(new Acorn("kju","권지언"));
		Acorn acorn = (Acorn)box2.getItem();
		System.out.println(acorn);
		
		Object o = new Acorn("kju","권지언");  //상속관계에서 upcasting
		Acorn a1 = (Acorn)o; //down casting
		System.out.println(a1);
		
		//잘못된 다운캐스팅
		Object exo = new Object();  //오른쪽에 오는것이 실체다
		Acorn aex = (Acorn)exo;    //실체가 다르면 돌아갈 수 없다
		//태생적으로 Object이기 때문에 돌아갈 수 없다
		
		System.out.println(aex.getId());
	}
}

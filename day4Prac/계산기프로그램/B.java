package day4Prac.계산기프로그램;

public class B implements Calculator{
	@Override
	public int add(int su1, int su2) {
		System.out.println("B계산기");
		return su1+su2;
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.add(1, 10);
	}
}

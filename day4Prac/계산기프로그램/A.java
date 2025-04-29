package day4Prac.계산기프로그램;

public class A implements Calculator{
	@Override
	public int add(int su1, int su2) {
		System.out.println("A계산기");
		return su1+su2;
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.add(5, 10));
	}
}

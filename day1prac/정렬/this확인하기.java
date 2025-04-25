package day1prac.정렬;

public class this확인하기 {
	public static void main(String[] args) {
		Acorn a = new Acorn("pws","박시우",250);
		Acorn b = new Acorn("ldw","이동우",100);
		
		int result = a.compareTo(b);
		System.out.println(result);
	}
}

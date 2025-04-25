package day1prac.정렬;

public class 변수교환하기 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//교환
		//임시변수
		
		System.out.printf("a=%d b=%d\n",a,b);
		
		int tmp = a;
		a=b;
		b=tmp;
		
		System.out.printf("a=%d b=%d",a,b);
	}
}

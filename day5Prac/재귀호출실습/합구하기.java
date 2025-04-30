package day5Prac.재귀호출실습;

public class 합구하기 {
	public static void main(String[] args) {
		System.out.println("재귀호출이란? 자기자신을 호출하는 것을 말한다");
		System.out.println("주의사항!! 반드시 종료 조건이 있어야 한다");
		
		//1~5까지의 합 //반복문
		int result = getTotal(5);
		System.out.println(result);
		
		//1~5까지의 합 재귀함수(메소드)
		int resultr = getTotalR(5);
		System.out.println(resultr);
	}

	//재귀 메소드
	private static int getTotalR(int n) {
		// 재귀 메소드는 자기자신을 호출하는 메소드
		// 종료조건이 있어야 함 !!
		
		if(n==1) {
			return 1;
		} else {
			return n+getTotalR(n-1);
		}
	}

	private static int getTotal(int n) {
		int total=0;
		
		for(int i=1; i<=n; i++) {
			total+=i;
		}
		
		return total;
	}
}

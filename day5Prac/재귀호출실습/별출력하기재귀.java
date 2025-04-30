package day5Prac.재귀호출실습;

public class 별출력하기재귀 {
	public static void main(String[] args) {
		printStarR(5);
	}
	
	public static void printStarR(int su) {
		if(su==0) {
			return;
		} else {
			System.out.println("*");
			printStarR(su-1);
		}
	}
}

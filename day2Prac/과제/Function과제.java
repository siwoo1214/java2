package day2Prac.과제;

import java.util.function.Function;

public class Function과제 {
	public static void main(String[] args) {
		Function<Integer, Integer> f = t -> t * t;
		System.out.println(f.apply(3));

		Function<Integer, Integer> f2 = (t) -> {
			return (int) (Math.random() * t);
		};
		System.out.println(f2.apply(10));

		Function<Integer, String> f3 = t -> {
			int[] mList = { 50000, 10000, 5000, 1000 };
			String result = "";
			for (int m : mList) {
				if (t / m > 0) {
					result += m + "원 " + (t / m) + "장\n";
					t -= ((t / m) * m);
				}
			}
			return result;
		};
		
		System.out.println(f3.apply(65000));
	}
}

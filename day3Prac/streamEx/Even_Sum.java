package day3Prac.streamEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Even_Sum {
	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		Random r = new Random();
		
		for(int i=1; i<51; i++) {
			nums.add(r.nextInt(100));
		}
//		
//		System.err.println(nums);
//		
//		Integer[] arr = new Integer[10];
//		Object[] numArr = nums.toArray();
//		
//		System.arraycopy(numArr, 0, arr, 0, 10);
//		
//		System.out.println(Arrays.toString(arr));
		
		System.err.println("스트림으로 숫자 생성후 출력하기");
		IntStream stream = new Random().ints(1,30);
//		int sum = stream.filter(item->item%2==0).limit(10).sum();
//		stream.limit(10).filter(item->item%2==0).forEach(item->System.out.print(item+" "));
		int sum = stream.limit(10).filter(item->item%2==0).sum();
		System.out.println(sum);
	}
}

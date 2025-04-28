package day3.stream만나기2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class 기본자료형배열_역순정렬하기 {

	public static void main(String[] args) {
		int[] arr= {34,5,35,35,3};		
		IntStream  intst  =Arrays.stream(arr);
		intst.boxed().sorted( Comparator.reverseOrder()).forEach( t -> System.out.println( t));

	}

}

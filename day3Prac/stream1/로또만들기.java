package day3Prac.stream1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class 로또만들기 {
	public static void main(String[] args) {
		Set<Integer> lottos = new HashSet<>();  //중복제거
		Random r = new Random();
		
		for(int i=0; i<20; i++) {
			lottos.add(r.nextInt(46));
		}
		
		System.out.println(lottos.size());
		
		Integer[] result = new Integer[6];
		Object[] lottoArray = lottos.toArray();  //set->난수배열 (6개만 새로운 배열로 copy)
		
		System.arraycopy(lottoArray, 0, result, 0, 6);
		
		// lottoArray
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 [index]
		// 4 11 32 28 14 5 => 6개를 copy해서 복사 붙여넣기 하는것임
		System.out.println(Arrays.toString(result));
		
		//stream으로 로또번호
		System.err.println("스트림으로 로또번호 생성 후 출력하기");
		IntStream stream = new Random().ints(1,46);  //1~46범위의 난수 생성
		stream.distinct().limit(6).sorted().forEach(str->System.out.print(str+" "));
	}
}

package day4Prac.스트림추가;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class 이름개수구하기_파일읽기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/day4Prac/스트림추가/test.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String str = "";
		while((str=br.readLine())!=null) {
			list.add(str);
		}
		System.out.println(list.size());
		
		//스트림 얻어오기
		Stream<String> stream = list.stream();
		long cnt = stream.filter(s->s.equals("박시우")).count();
		System.out.println(cnt);
	}
}

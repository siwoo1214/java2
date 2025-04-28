package day3Prac.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		// <key,value> 쌍으로 저장되어지는 자료구조
		Map<String,String> map = new HashMap<>();
		
		map.put("naver", "1214");
		map.put("google", "001214");
		map.put("acorn", "1928");
		
		System.out.println(map.containsKey("naver"));
		
		String value = map.get("naver");
		System.out.println("naver 비밀번호 : "+value);
		
		//전체 데이터 순회
		Set<String> keys = map.keySet();
		keys.forEach(item->System.out.println(item));
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		//값만 출력
		for(String a :map.values()) {
			System.out.println(a);
		}
		
		// key-value의 한 세트로 가져오기 -> Map.Entry (엔트리형식으로 갖고오기)
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
		}
		
		//요즘엔 엔트리셋말고 주로 BiConsumner을 사용한다
		//BiConsumer => 매개변수 2개짜리 Consumer
		//forEach
		map.forEach((s1,s2)->{System.out.println("for each : "+s1+" "+s2);});
	}
}

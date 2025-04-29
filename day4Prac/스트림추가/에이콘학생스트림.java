package day4Prac.스트림추가;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class 에이콘학생스트림 {
	public static void main(String[] args) {
		
		//Stream<T>
		//Stream<Integer>
		
		//IntStream => 기본형스트림이 제공하는 기능들이 있다 (합계, 통계 정보)
		//DoubleStream
		
		List<Acorn> list = new ArrayList<>();
        list.add(new Acorn("권지언", 90, 80, 70));
        list.add(new Acorn("김민환", 85, 95, 75));
        list.add(new Acorn("최하은", 88, 92, 86));
        list.add(new Acorn("황예지", 70, 65, 80));
        list.add(new Acorn("김보성", 60, 77, 83));
        list.add(new Acorn("최지태", 95, 90, 93));
        list.add(new Acorn("이동우", 95, 84, 89));
        
        //국어점수만 IntStream으로 만들기
        list.stream().mapToInt(acorn->acorn.getKor()).forEach(tmp->System.out.println(tmp));
        
        //
        IntSummaryStatistics st = list.stream().mapToInt(acorn->acorn.getKor()).summaryStatistics();
        System.out.println(st);
        
        //국어점수가 80이상인 학생 출력
        list.stream().filter(tmp->tmp.getKor()>=80).forEach(tmp->System.out.println(tmp));
        
        //국어점수가 80이상인 학생을 List로 만들기
        System.err.println("국어점수가 80이상인 학생을 List로 만들기");
        List<Acorn> list80 = list.stream()
        		.filter(tmp->tmp.getKor()>=80)
        		.collect(Collectors.toList());
        System.out.println("국어점수 80이상");
        list80.forEach(System.out::println);
        
        //List<String>
        //Set<Integer>
        //Set<Acorn>
        //Map<String,Acorn>
        List<String> listname = list.stream()
        		.map(acorn->acorn.getName())
        		.collect(Collectors.toList());
        listname.forEach(System.out::println);
        
        System.err.println("set으로 반환");
        Set<Integer> setkor = list.stream()
        		.map(acorn->acorn.getKor())
        		.collect(Collectors.toSet());
        setkor.forEach(System.out::println);
        
        System.err.println("Map으로 반환");
        Map<String,Acorn> acornMap = list.stream()
        		.collect(Collectors.toMap(acorn->acorn.getName(),acorn->acorn));
        Acorn acorn = acornMap.get("이동우");
        System.out.println(acorn);
        System.err.println("map같은 경우는 BIConsumer의 형태로 명시해줘야 한다");
        acornMap.forEach((key,value)->{System.out.println(key+" "+value);});
        
        //
        System.err.println("for반복문 버전");
        for(Map.Entry<String, Acorn> entry : acornMap.entrySet()) {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
	}
}

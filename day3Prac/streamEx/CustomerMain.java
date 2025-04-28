package day3Prac.streamEx;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerMain {

	public static void main(String[] args) {
		
		
		ArrayList<Customer> list = new ArrayList<>();

		list.add(new Customer("user1", "홍길동", "vvip", 15000));
		list.add(new Customer("user2", "김철수", "vip", 12000));
		list.add(new Customer("user3", "이영희", "bronze", 5000));
		list.add(new Customer("user4", "박민수", "vvip", 20000));
		list.add(new Customer("user5", "최수진", "vip", 11000));
		list.add(new Customer("user6", "한지민", "bronze", 4000));
		list.add(new Customer("user7", "장도연", "vvip", 18000));
		list.add(new Customer("user8", "정우성", "vip", 13000));
		list.add(new Customer("user9", "배수지", "bronze", 3000));
	    list.add(new Customer("user10", "손흥민", "vvip", 25000));
	    
	    //vvip인 사람이 몇명인지
	    Stream<Customer> cus = list.stream();
	    long vvip_num = cus.filter(item->item.getGrade().equals("vvip"))
	    		.count();
	    System.out.println("vvip인 사람 : "+vvip_num+"\n");
	    
	    //고객등급이 vip인 사람만 출력
	    System.err.println("고객등급이 vip인 사람만 출력");
	    Stream<Customer> cus2 = list.stream();
	    cus2.filter(item->item.grade.equals("vip"))
	    .forEach(item->System.out.println(item));
	    
	    // 3. 포인트가 높은 사람순으로 정렬해서 출력
	    System.err.println("3. 포인트가 높은 사람순으로 정렬해서 출력");
	    Stream<Customer> cus3 = list.stream();
	    cus3.sorted((o1,o2)->o2.getPoint()-o1.getPoint())
	    .forEach(item->System.out.println(item));

	}
	
    
    
    
    
    
}

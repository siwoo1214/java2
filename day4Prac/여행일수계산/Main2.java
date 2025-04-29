package day4Prac.여행일수계산;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Main2 {
	Transportation transportation;
	Map<String, Integer> tour = new HashMap<>();
	
	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}

	public void run() {
		
		System.out.println("여행을 떠나봅시다");
		
		Scanner sc = new Scanner(System.in);

		loop:while (true) {
			
			
			System.err.println("지역을 입력해 주세요");
			String location = sc.next();
			
			if(location.equals("종료")){
				System.out.println("✈️다녀온 여행지 별 거리✈️");
				tour.forEach((where, howfar) -> {System.out.println(where + " : " + howfar + "KM");});
				break loop;
			} 

			if (tour.containsKey(location)) {
				String city = location; // 키(도시 이름)
				Integer distance = tour.get(city); // 값(거리)
				System.out.println(city + "까지 거리: " + distance + "km");
				int total = transportation.travel_period(distance);
				System.out.println(city + "까지 거리: " + distance + "km "+total+"시간이 소요됩니다.");
			} else if(!tour.containsKey(location)) {
				System.out.println("해당하는 지역이 없습니다.");
				System.out.println("지역과 거리를 입력해 주세요");
				location = sc.next();
				int distanceA = sc.nextInt();
				tour.put(location, distanceA);
				//tour.forEach((menuName, price) -> {System.out.println(menuName + " : " + price + "KM");});
				System.out.println(location + " 까지 거리: " + distanceA + "km");
				int total = transportation.travel_period(distanceA);
				System.out.println(location + "까지 거리: " + distanceA + "km "+total+"시간이 소요됩니다.");
			}
		}
	}

	private String gyotong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 교통수단을 이용하시겠습니까? 1.자차 2.비행기 3.여객선");
		int what = sc.nextInt();
		switch(what) {
		case 1:
			return "Car.txt";
		case 2:
			return "Airplane.txt";
		case 3:
			return "Ship.txt";
		}
		return null;
	}
	
	public Transportation ready() throws Exception {
		Main2 m = new Main2();
		
		String whatGyotong = m.gyotong();
		
		Properties p = new Properties();
		p.load(new FileReader("src/day4Prac/여행일수계산/"+whatGyotong));
		String name = (String)p.get("transportation");
		Class clazz = Class.forName(name);
		Transportation trns = (Transportation) clazz.getDeclaredConstructor().newInstance();
		return trns;
	}
	
	public static void main(String[] args) throws Exception {
		
		Main2 m = new Main2();
		m.setTransportation(m.ready());
		m.run();
		
	}
}

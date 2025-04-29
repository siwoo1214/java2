package day3Prac.streamEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ParsingEx {
	public static void main(String[] args) {
		ArrayList<Player> player = new ArrayList<>();
		player.add(new Player("Lionel Messi", 36, "Argentina", 2800, 30));
        player.add(new Player("Cristiano Ronaldo", 39, "Portugal", 2700, 25));
        player.add(new Player("Kylian Mbappe", 25, "France", 2600, 35));
        player.add(new Player("Erling Haaland", 24, "Norway", 2500, 32));
        player.add(new Player("Kevin De Bruyne", 33, "Belgium", 2200, 10));
        
        player.forEach(System.out::println);
        
        Collections.sort(player, new Comparator<Player>() {
			@Override
			public int compare(Player o1, Player o2) {
				return o2.goals-o1.goals;
			}
        });
        
        System.out.println("골 수 기준 정렬");
        player.forEach(System.out::println);
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<3; i++) {
        	map.put(player.get(i).getName(), player.get(i).getGoals());
        }
        
//        System.err.println("상위 3명의 정보");
        Stream<Player> list = player.stream();
//        list.limit(3).forEach(System.out::println);;
//        
        
        Collections.sort(player, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				return o1.mins-o2.mins;
			}});
        System.out.println("출전시간 올림차순");
        for(Player a : player) {
        	System.out.println(a);
        }
        
        System.err.println("foreach출력");
        int totalGoals = list.map(Player::getGoals).reduce(0,(sum,goals)->sum+goals);
        System.out.println(totalGoals);
//        list.map(Player::getGoals).forEach(tmp->System.out.println(tmp));
	}
}

package day5Prac.enum실습하기;

import java.util.PriorityQueue;
import java.util.Queue;

class Game implements Comparable<Game>{
	String name;
	int price;
	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}
	public Game(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Game o) {
		// TODO Auto-generated method stub
		return -this.price+o.price;  //기준(this)이 클 때 자리 교환이 일어남
	}
}

public class 우선순위큐문제 {
	public static void main(String[] args) {
		
		//우선순위 큐 사용하기
		Queue<Game> q = new PriorityQueue<>();
		q.offer(new Game("세상에서 가장 어려운 게임",4000));
		q.offer(new Game("뱀파이어 서바이벌",5000));
		q.offer(new Game("리그 오브 씹레전드",12000));
		q.offer(new Game("Call Of Duty",34000));
		q.offer(new Game("GTA 32",432000));
		
		while(!q.isEmpty()) {
			Game game = q.poll();
			System.out.println(game);
		}
		
	}
}

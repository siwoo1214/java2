package day5Prac.스택큐;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class 스택큐 {
	public static void main(String[] args) {
		// 스택, 큐 => 자료구조 (데이터를 어떻게 저장할 것이냐에 대한 문제)
		// 저장하는 방법, 꺼내는 방법
		
		// 스택 : 바닥이 막힌 통 (선입후출 FILO) 
		// 큐 : 대기줄 (FIFO)
		
		Stack<String> st = new Stack<>();
		
		st.push("1");
		st.push("2");
		st.push("3");
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		//stack
		//poll
		//큐에 저장하기
		Queue<String> q = new ArrayDeque<>();
		q.offer("1");
		q.offer("2");
		q.offer("3");
		
		//꺼내기
//		String qdata = q.poll();
//		System.out.println(qdata);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
	
}

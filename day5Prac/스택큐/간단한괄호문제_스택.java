package day5Prac.스택큐;

import java.util.Stack;

public class 간단한괄호문제_스택 {
	public static void main(String[] args) {
		
		// "(()))" 이게 올바른 괄호문인지 판단하기
		// 스택 자료구조를 이용해서 올바른 괄호인지 판별하겠다
		// ( => 스택에 push 
		// ) => 스택에서 pop
		
		String test = "((())";
		//String test2 = "(()";
		
		Stack<Character> stack = new Stack<>();
		
		//실패지점 : 꺼내려고 할 때 비어있으면, 모든 작업이 끝났는데 스택에 남아 있는게 있으면 실패
		
		boolean result = true;
		for(int i=0; i<test.length(); i++) {
			char ch = test.charAt(i);
			
			//스택에 담기
			if(ch=='(') {   //스택에 담기
				stack.push(ch);
			} else if(ch==')') {   //스택에 꺼내기
				if(stack.isEmpty()) {  //스택이 비어있으면
					result=false;
				} else {
					stack.pop();
				}
			}
		}
		
		if(!stack.isEmpty()) {
			result=false;
		}
		
		System.out.println(result);
	}
}

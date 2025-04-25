package day2Prac.함수형인터페이스2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RunnableEx {
	public static void main(String[] args) {
		/*
		 * interface Runnable{
		 *     void run();
		 * }
		 */
		
		//익명함수
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run !!!");
			}};
			
		r.run();
			
		//람다함수
		Runnable r2 = ()->{
			System.out.println("run~~~~~");
		};
		
		r2.run();
		
		/*
		 * interface Consumer<T>{
		 *      
		 * }
		 */
		
		//제네릭은 wrapper class만 가능하다
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				t-=100;
				t-=200;
				System.out.println(t);
		}};
		
		c.accept(10000);
		
		//Lambda
		Consumer<String> c2 = (str)->{System.out.println(str+"람다요");};
		c2.accept("내가 바로 ");
		
		
		ArrayList<String> likes = new ArrayList<>();
		likes.add("Charlie puth");
		likes.add("Kanye");
		likes.add("Maroon 5");
		
		//람다함수
		likes.forEach((n)->{System.out.println(n);});
		
		//인터페이스 구현
		likes.forEach(new Consumer<String>() {    //익명으로 사용 할 때는 생성자 만드는 것처럼 사용하면 된다

			@Override
			public void accept(String t) {
				System.out.println(t);
		}});
		
		/*
		 * interface Supplier<T>{
		 *     T get();
		 * }
		 */
		Supplier<String> s = ()->{return "람다로 구현한 문자열";};
		String result = s.get();
		System.out.println(result);
		
		Supplier<String> s2 = new Supplier<String>() {
			@Override
			public String get() {
				return "람다로 구현한 문자열 2ver";			
			}};
		String result2 = s2.get();
		System.out.println(result2);
		
		class A implements Supplier<String>{

			@Override
			public String get() {
				return "문자열 있는 이름있는 클래스로 구현";
			}
			
		}
		A a = new A();
		String result3 = a.get();
		System.out.println(result3);
		
		/*
		 * interface Predicate<T>() {
		 *     boolean test(T t);
		 * }
		 */
		
		Predicate<String> p = (str1)->{
			if(str1.equals("hello")) {
				return true;
			}else {
				return false;
			}
		};
		
		boolean resultb = p.test("hello");
		boolean resultb2 = p.test("hell yea");
		System.out.println(resultb+" "+resultb2);
		
		Predicate<Integer> p2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t%2==0) {
					return false;
				} else {
					return true;
				}
			}
		};
		
		boolean resultb3 = p2.test(7);
		System.out.println("짝수"+resultb3);
		
		
		/*
		 * interface Function<R, T>(){
		 * 		R apply(T t);
		 * }
		 */
		
		Function<Integer,Integer> f = (num)->{return num*2;}; 
		System.out.println(f.apply(999));
		
		//<매개변수, return타입>
		Function<Integer,int[]> f1 = (num)->{
			int[] arr = {3,6,9};
			return arr;
		};
		
		int[] rtn = f1.apply(1000);
		for(int i=0; i<rtn.length; i++) {
			System.out.print(rtn[i]);
		}
		
		
	}
}

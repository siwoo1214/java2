package day1.실습;

public class Box<T> {
	
	T[] list = (T[]) new Object[30];
	int idx = 0;
	
	
	public Box(T[] list) {
		this.list = list;
	}

	void add(T something) {
		list[idx] = something;
		idx++;
	}
	
	T pop() {
		T tmp = (T) list[idx];
		idx--;
		return tmp;
	}
	
	void remove(int index) {
		list[index]=null;
		idx--;
	}
	
	void queryAll(T[] arr) {
		for(T a : arr) {
			System.out.print(a+" ");
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {77,56,7,23,54,3,2};
		String[] b = {"apple","banana","orange","watermelon"};
		Character[] c = {'s','b','g','e','y','x','f','h'};
		
		Box<Integer> box = new Box<>(  a);
		box.add(77);
		box.pop();
		box.queryAll(a);
		
		Box<String> box2 = new Box<>(b);
		box2.add("tengerin");
		box2.pop();
		box2.queryAll(b);
		
		Box<Character> box3 = new Box<Character>(c);
		box3.add('f');
		box3.pop();
		box3.queryAll(c);
	}
}

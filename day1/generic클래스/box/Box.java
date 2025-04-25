package day1.generic클래스.box;

public class Box<T> {
	
	
	Object[] list  = new Object[10];
	int index=0;
	
	//add
	
	public void add( T  item) {
		list[index]= item;
		index++;
	}
	
	
	//get
	
	public T  get( int i) {
		return (T) list[i];
	}
	
	
	
	//size
	
	public int size() {
		return index;
	}

}

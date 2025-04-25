package day2Prac.forEach;

import java.util.function.Consumer;

public class B implements Consumer{
	
	@Override
	public void accept(Object t) {
		//다운캐스팅
		String s = (String) t;
		System.out.println(s);
	}
}

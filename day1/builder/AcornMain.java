package day1.builder;

public class AcornMain {

	public static void main(String[] args) {
		 
		
		Acorn acorn = new Acorn.Builder()
				.id("acorn")
				.pw("1234")
				.build();
		
		
		
		
		System.out.println( acorn);
		
		
		
		Acorn acorn2  = new Acorn.Builder()
				.id("test").pw("0000").build();
		
		
		System.out.println( acorn2);
		}

}

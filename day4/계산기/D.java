package day4.계산기;

public class D  implements Calculator{

	@Override
	public int add(int su1, int su2) {
		System.out.println( "D   add"); 
		return su1+ su2;
	}

}

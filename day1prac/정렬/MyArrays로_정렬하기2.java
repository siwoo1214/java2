package day1prac.정렬;

public class MyArrays로_정렬하기2 {
	public static void main(String[] args) {
		Acorn2[] list = new Acorn2[5];
		
		list[0] = new Acorn2("ljh","이정호",500);
		list[1] = new Acorn2("kmh","김민환",600);
		list[2] = new Acorn2("kym","김유민",140);
		list[3] = new Acorn2("psk","박수경",200);
		list[4] = new Acorn2("lsm","이수민",790);
		
		MyArrays.sort(list);
		
		
		System.out.println("정렬 후");
		for(int i=0; i<list.length; i++) {
			Acorn2 acorn = list[i];
			System.out.println(acorn);
		}
	}
}

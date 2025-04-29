package day1.오늘의요리사;

public class Siwoo extends Cook implements 한식가능한{
	
	public Siwoo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 비빔밥만들기() {
		// TODO Auto-generated method stub
		return "나는 비빔인간입니다.";
	}

}

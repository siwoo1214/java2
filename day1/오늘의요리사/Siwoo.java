package day1.오늘의요리사;

public class Siwoo extends Cook implements 일식가능한, 중식가능한, 한식가능한{
	
	public Siwoo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 비빔밥만들기() {
		return "저는 비빔인간입니다";
	}

	@Override
	public String 탕수육만들기() {
		return "나는 부먹인간입니다";
	}

	@Override
	public String 초밥만들기() {
		return "나는 와사비인간입니다";
	}
	
	
	

}

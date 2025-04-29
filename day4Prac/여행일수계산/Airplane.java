package day4Prac.여행일수계산;

public class Airplane implements Transportation{
	@Override
	public int travel_period(int howlong) {
		// TODO Auto-generated method stub
		return howlong/900;
	}
	//1시간 당 900km + 이/착륙시간 30분
}

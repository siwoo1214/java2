package day4Prac.여행일수계산;

public class Car implements Transportation{
	@Override
	public int travel_period(int howlong) {
		return howlong/100;
	}
	//1시간 당 100km
}

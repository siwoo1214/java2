package day4Prac.여행일수계산;

public class Ship implements Transportation{
	@Override
	public int travel_period(int howlong) {
		// TODO Auto-generated method stub
		return howlong/35;
	}
	//시간 당 35km
}

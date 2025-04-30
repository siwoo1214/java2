package day5Prac.에너테이션실습;

public class Weather {
	@NiceWeather(value = {"맑음","화창"})
	String weather;
	int temperture;
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public int getTemperture() {
		return temperture;
	}
	public void setTemperture(int temperture) {
		this.temperture = temperture;
	}
	@Override
	public String toString() {
		return "Weather [weather=" + weather + ", temperture=" + temperture + "]";
	}
	public Weather(String weather, int temperture) {
		super();
		this.weather = weather;
		this.temperture = temperture;
	}
	
	public Weather() {
		// TODO Auto-generated constructor stub
	}
}

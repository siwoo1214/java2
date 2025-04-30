package day5Prac.필드정보가져오기;

public class Store {
	int apple;
	int banana;
	@Override
	public String toString() {
		return "Store [apple=" + apple + ", banana=" + banana + "]";
	}
	public int getApple() {
		return apple;
	}
	public void setApple(int apple) {
		this.apple = apple;
	}
	public int getBanana() {
		return banana;
	}
	public void setBanana(int banana) {
		this.banana = banana;
	}
	public Store(int apple, int banana) {
		super();
		this.apple = apple;
		this.banana = banana;
	}
	
	public Store() {
		// TODO Auto-generated constructor stub
	}
}

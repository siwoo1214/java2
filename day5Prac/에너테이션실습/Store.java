package day5Prac.에너테이션실습;

public class Store {
	
	@Count(value=5)   //value = 5로 설정
	int apple;
	
	@Count(10)        //value라는 이름은 생략된 형태로 사용가능
	int banana;

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

	@Override
	public String toString() {
		return "Store [apple=" + apple + ", banana=" + banana + "]";
	}
}

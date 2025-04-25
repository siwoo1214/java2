package day2Prac.함수형인터페이스;

public class 실습_함수형인터페이스 {

	interface GuGu {
		void getNum(int i);
	}

	public static void main(String[] args) {

		System.out.println("==지역내부 클래스로 작성==");
		// 1. 지역내부클래스 작성
		class G implements GuGu {
			@Override
			public void getNum(int i) {
				for (int j = 1; j <= 9; j++) {
					int mul = i * j;
					System.out.println(mul);
				}
			}
		}

		G g = new G();
		g.getNum(3);

		System.out.println("==익명 클래스로 작성==");
		// 2. 익명 클래스로 작성
		GuGu g2 = new GuGu() {

			public void getNum(int i) {

				for (int j = 1; j <= 9; j++) {
					int mul = i * j;
					System.out.println(mul);
				}

			}
		};

		G g3 = new G();
		g3.getNum(4);

		System.out.println("==람다식으로 작성==");
		// 3. 람다식 1
		GuGu g1 = (num) -> {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num * i);
			}
		};

		g1.getNum(5);

	}
}

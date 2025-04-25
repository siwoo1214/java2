package day02prac.과제;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Supplier과제 {
	public static void main(String[] args) {
		게살버거만들기 s = new 게살버거만들기();
		System.out.println(s.get());
		
	}
}

class 게살버거만들기 implements Supplier<레시피> {
	private 레시피 recipe;

	public 게살버거만들기() {
		setRecipe();
	}

	private void setRecipe() {
		ArrayList<String> res = new ArrayList<>();
		res.add("크래미를 잘게 찢어줍니다.");
		res.add("볼에 크래미, 양파, 빵가루, 옥수수, 달걀, 부침가루를 넣고 섞어줍니다.");
		res.add("치대주면서 모양을 동그랗게 만들어 줍니다.");
		res.add("빵가루를 묻혀줍니다.");
		res.add("모닝빵을 구워줍니다.");
		res.add("기름을 두르고 게살패티를 구워줍니다.");
		res.add("모닝빵에 마요네즈를 바르고 양상추를 올려줍니다.");
		res.add("패티를 올리고 토마토 소스를 바르고 다시 모닝빵을 올려 완성~!");
		this.recipe = new 레시피("게살버거", res);
	}

	@Override
	public 레시피 get() {
		return this.recipe;
	}

}

class 레시피 {
	private String name;
	private ArrayList<String> recipe;

	public 레시피(String name, ArrayList<String> recipe) {
		super();
		this.name = name;
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		String result = null;
		result = "이름 : " + name + "\n";
		for (int i = 0; i < this.recipe.size(); i++) {
			result += (i + 1) + "번. " + this.recipe.get(i) + "\n";
		}
		return result;
	}

}
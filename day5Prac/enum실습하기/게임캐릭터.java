package day5Prac.enum실습하기;

public class 게임캐릭터 {
	String name;
	CharacterState state;
	
	public 게임캐릭터() {
		// TODO Auto-generated constructor stub
	}

	public 게임캐릭터(String name) {
		super();
		this.name = name;
		this.state = CharacterState.정상;
	}
	
	public 게임캐릭터(String name, CharacterState state) {
		super();
		this.name = name;
		this.state = state;
	}


	@Override
	public String toString() {
		return "게임케릭터 [name=" + name + ", state=" + state + "]";
	}
	
	public void 공격하기() {
		state = CharacterState.공격;
		System.out.println(name+": "+state+"로 전환되었다");
	}
	
	public void 죽기() {
		state = CharacterState.죽음;
		System.out.println(name+": "+state+"로 전환되었다");
	}
	
	public void 수비하기() {
		state = CharacterState.수비;
		System.out.println(name+": "+state+"로 전환되었다");
	}
	
	public void printState() {
		System.out.println(name+": "+state+"입니다");
	}
	
	
}

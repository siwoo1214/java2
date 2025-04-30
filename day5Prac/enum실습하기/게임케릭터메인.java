package day5Prac.enum실습하기;

public class 게임케릭터메인 {
	public static void main(String[] args) {
		게임캐릭터 영웅 = new 게임캐릭터("영웅");
		게임캐릭터 전사 = new 게임캐릭터("전사");
		게임캐릭터 마법사 = new 게임캐릭터("마법사");
		
		영웅.printState();
		전사.printState();
		마법사.printState();
		
		//캐릭터 상태 변경
		영웅.공격하기();
		전사.수비하기();
		마법사.죽기();
		
		영웅.printState();
		전사.printState();
		마법사.printState();
	}
}

package ch07;

public class Ex22_Main {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Cow cow = new Cow();
		
		tiger.sound();
		cow.sound();
		System.out.println();
		
		// 자동 타입 변환
		Ex22_Animal animal = new Tiger();
		animal.sound();
		animal = new Cow();
		animal.sound();
		System.out.println();
		
		// 매개변수의 자동 타입 변환
		animalSound(new Tiger());
		animalSound(new Cow());

	}
	static void animalSound(Ex22_Animal animal) {
		animal.sound();
	}
}

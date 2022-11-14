package ch10;

public class Ex04_ClassCast {

	public static void main(String[] args) {
		Animal animal1 = new Cat();		// 다형성
		Animal animal2 = new Dog();		// 다형성
		
		Cat cat = (Cat)animal1;
		Dog dog = (Dog)animal1;
		
	}

}

class Animal{}

class Cat extends Animal{}
class Dog extends Animal{}


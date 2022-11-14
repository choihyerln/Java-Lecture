package ch07;

public class Ex04_Person {
	
	String name;
	String gender;
	int age;
	
	Ex04_Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	void eat() {
		System.out.println("밥을 먹습니다.");
	}
	
	void sleep() {
		System.out.println("잠을 잡니다.");
		
	}
	
	
	
}

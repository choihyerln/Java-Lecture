package ch07;

public class Ex11_Polymorphism {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		parent = child1;	// 부모-자식 자동 변환 : 자식은 부모의 타입으로 자동으로 타입 변환 가능
		parent = child2;
		parent = new Child1();
		parent = new Child2();

	}

}


class Parent {
	
}

class Child1 extends Parent{
	
}

class Child2 extends Parent{
	
}

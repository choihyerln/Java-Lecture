package ch07;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Parent parent = new Ex01_Parent();
		Ex01_Child child = new Ex01_Child();
		
		parent.parentInt = 5;
		parent.parentMethod();
		
		child.childInt = 10;
		child.childMethod();
		
		
		child.parentInt = 20;		// 자식이 부모의 필드를 수정하여 사용할 수 있다.	
		child.parentMethod();		// 자식이 부모의 메소드 사용할 수 있음
	}

}

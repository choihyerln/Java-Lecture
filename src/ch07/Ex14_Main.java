package ch07;

public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Parent parent = new Ex14_Parent();
		Son son = new Son();
		Daughter daughter = new Daughter();
		
		parent = son;		// 자동 타입 변환
		parent.parentMethod();		// name, parentMethod 만 사용 가능
		
		parent = daughter;
		parent.parentMethod();
		
		/* 강제 타입 변환 올바르지 않은 방법 */
		
//		daughter = (Daughter)parent;	// 강제 타입 변환(Casting)
//		daughter.daughterMethod();
//		
		
		/* 강제 타입 변환 올바른 방법 */
		
		if (parent instanceof Daughter) {
			daughter = (Daughter)parent;	// 강제 타입 변환(Casting)
			daughter.daughterMethod();
		}
		if (parent instanceof Son) {
			son = (Son)parent;	// 강제 타입 변환(Casting)
			son.sonMethod();
		}
	}

}
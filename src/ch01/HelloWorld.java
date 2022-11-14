package ch01; // 내가 속해있는 그룹 (클래스를 묶어놓은 그룹)

/*
 * 이건 블럭단위로 주석 쓸 때 사용하고 한줄 단위면 아래처럼 // 로 사용하기 
 */

public class HelloWorld {	// class -> 클래스 이름은 반드시 대문자, 접근제한자 : public(공개),private(여기클래스안에서만)

	public static void main(String[] args) {	// method -> 소문 , static : 객체 생성 안해도 됨, void : 반환값의 타입이 없다. 즉, 리턴벨류가 없다., main : 프로그램의 시작점
		System.out.println("Hello World!!!"); 
		System.out.println("Hello World!!!");
		
		
		int x = 1; // 변수는 메인메모리상에 기억장소를 가지고 있는다. 값이 1이었다가 
		int y = x + 1; // 
		System.out.println("x = " + x + ", y = " + y); // syso + ctrl + space -> 맥북은 단축키 다르니까 찾아보기!
	}

}

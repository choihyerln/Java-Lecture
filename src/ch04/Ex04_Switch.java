package ch04;
/**
 * Switch
 */

public class Ex04_Switch {

	public static void main(String[] args) {
		
		int score = 83;
		String grade;
		
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;		// 반복문, 조건문에서 한꺼풀 벗어나는 (스위치 블록을 탈출하는 역할)
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:		// 위에서 조건이 맞지 않는 경우 (if문에서의 else 역할)
			grade = "F";
		}
		
		System.out.println(score + "점은 " + grade + "학점입니다.");
		

	}

}

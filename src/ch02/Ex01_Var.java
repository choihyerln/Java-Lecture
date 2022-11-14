package ch02;

public class Ex01_Var {

	public static void main(String[] args) {
		int score = 90;	// 리터럴, 변수 선언할 때 초기값 부여
		int result = score * 2;
		
		// 리터럴 (Literal)
		int intLiteral = 30;	// integer
		int octal = 036;		// 8진수(octal)
		int hexa = 0x1e;		// 16진수(hexadecimal)
		System.out.printf("%d, %d, %d\n", intLiteral, octal, hexa);
		
		
		double dounbleLiteral = 3.14159;	// floating point(실수)
		char charLiteral = 'a';		//single quote(문자, 글자 1개)
		String strLiteral = "A quick brown fox";	// 문자
		boolean boolLiteral = true; 	// true, false
		System.out.println(intLiteral);
		
	}

}

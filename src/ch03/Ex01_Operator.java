package ch03;

/**
 * 연산자(operator)
 */
		
public class Ex01_Operator {

	public static void main(String[] args) {
		int a = 3;
		int b = a++;		// post increment
		System.out.printf("a = %d, b = %d\n", a, b);		// \n은 뉴라인의 의미로 줄바꿈!
		int c = ++a;		// pre increment
		System.out.printf("a = %d, c = %d%n", a, c);			// %n 도 가능!

		
		String s = (a % 2 == 0) ? "짝수" : "홀수";		//3항 연산자 
		System.out.println(a + "은/는 " + s);
		
		
		int sum = 0;
		sum +=1;
		sum +=2;
		sum = 0;
		for (int i=1; i<10; i++)
			sum += i;
		System.out.println(sum);

		short s1 = 1;
		short ss = (short)-s1;		// 단항 연산자 -를 하면 결과가 int type이 되므로 강제로 타입변환을 해줘야함
	}

}

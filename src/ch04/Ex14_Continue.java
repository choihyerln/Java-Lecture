package ch04;
/**
 *  Continue
 */
public class Ex14_Continue {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0)
				continue;		// 3의 배수면 그거 제외하고 다음 숫자로 넘어간다
			sum += i;
		}
		
		System.out.println(sum);
		
		
		// 100 이하의 양의 정수에서 3의 배수의 합
		sum = 0;
		for (int i=3; i<=100; i+=3) {
			sum += i;
		}
		
		System.out.println(sum);
		
		// 위의 값이랑 같지만 다른 방법
		
		sum = 0;
		for (int i=99; i>=0; i-=3) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}

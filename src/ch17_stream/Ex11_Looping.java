package ch17_stream;

import java.util.Arrays;

public class Ex11_Looping {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		// 잘못 작성된 경우
		Arrays.stream(intArr)
			  .filter(i -> i % 2 == 0)
	//		  .peek(i -> System.out.println(i)); // peek는 중간처리라 결과가 보이지 않음
			  .forEach(i -> System.out.println(i));
		
		// peek를 사용하는 경우
		int total = Arrays.stream(intArr)
							.filter(i -> i % 2 == 0)
							.peek(i -> System.out.println(i))
							.sum();
		System.out.println("합계: " + total);
	}
}
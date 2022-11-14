package ch04;
/**
 * 제곱의 합, 합의 제곱 구하기
 */

import java.util.Scanner;

public class Ex16_sumOfSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 객체 생성
		int num;
		while (true) {
		System.out.print("10보다 큰 정수를 입력하세요.> ");
		num = scan.nextInt();
		if (num > 10)
			break;
		}
		scan.close();
		
		int sum = 0, sumOfSquare = 0;
		for (int i=1; i<=num; i++) {

			sum +=i;		// 합
			sumOfSquare += i*i;	// 제곱의 합
		}
		int squareOfSum = sum * sum;	// 합의 제곱
		
		System.out.println("제곱의 합: " + sumOfSquare);
		System.out.println("합의 제곱: " + squareOfSum);
		
		
	}

}

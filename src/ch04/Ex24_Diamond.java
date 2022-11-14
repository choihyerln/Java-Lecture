package ch04;

import java.util.Scanner;

/**
 * 다이아몬드 그리기
 */
public class Ex24_Diamond {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);	
		while (true) {
		System.out.print("10보다 작은 홀수를 입력하세요.> ");
			num = scan.nextInt();
			if (num >= 10 || num % 2 == 0)
				continue;
				break;
			}
			scan.close();
		
		int half = num/2;		// num이 9면 half는 4
		
		System.out.println("완성된 다이아몬드");
		for (int i=1; i<=half+1; i++) {				// i : 1 ~ 4
			for (int k = 1; k <= half - i + 1; k++)
				System.out.print(" ");
			for (int k = 1; k <= 2 * i -1; k++)
				System.out.print("*");
			System.out.println();
	}

	}
}


package ch04;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * 만 나이 계산하기
 * 
 * 생년월일을 입력으로 받아 오늘 현재 만 나이를 구하시오.
 * 
 */
public class Ex06_FullAge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// 객체 생성

		System.out.print("생년을 입력하세요.> ");
		int bYear = scan.nextInt();
		System.out.print("생월을 입력하세요.> ");
		int bMonth = scan.nextInt();
		System.out.print("생일을 입력하세요.> ");
		int bDay = scan.nextInt();
		LocalDate birthDay = LocalDate.of(bYear, bMonth, bMonth);
		System.out.println("생년월일: " + birthDay);
		scan.close();
		
		LocalDate today = LocalDate.now();
		System.out.println("오늘날짜: " + today);
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		
		int fullAge = 0;
		if (tMonth > bMonth)
			fullAge = tYear - bYear;
		else if (tMonth < bMonth)
			fullAge = tYear - bYear - 1;
		else {
			if (tDay >= bDay)
				fullAge = tYear - bYear;
			else
				fullAge = tYear - bYear - 1;

		}
		System.out.println("만 나이는 " + fullAge + "세 입니다.");
		
	}

}

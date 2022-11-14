package ch04;
/**
 * 윤년인지 평년인지
 */
public class Ex02_LeapYear {

	public static void main(String[] args) {
		
		int year = 2022;
		String result;
		
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 4 == 0 && year % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		
		System.out.println(year + "년은 " + result + "입니다.");
		
	}
}


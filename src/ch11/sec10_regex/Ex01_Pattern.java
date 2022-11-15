package ch11.sec10_regex;

import java.util.regex.Pattern;

public class Ex01_Pattern {

	public static void main(String[] args) {
		String regExp = "010-\\d{3,4}-\\d{4}";		// 이동전화번호
		String data1 = "02-1234-5678";
		String data2 = "010-234-6789";
		boolean result1 = Pattern.matches(regExp, data1);
		boolean result2 = Pattern.matches(regExp, data2);
		System.out.println(result1 + ", " + result2);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";		// 이메일
		data1 = "hr_1227@naver.com";
		data2 = "hr.1227@naver.com";
		result1 = Pattern.matches(regExp, data1);
		result2 = Pattern.matches(regExp, data2);
		System.out.println(result1 + ", " + result2);
		
		
		 
	}

}

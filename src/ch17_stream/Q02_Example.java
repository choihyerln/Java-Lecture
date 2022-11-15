package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Q02_Example {

	public static void main(String[] args) {
		List<Q02_Member> list = Arrays.asList(
				new Q02_Member("홍길동", 30),
				new Q02_Member("신용권", 40),
				new Q02_Member("김자바", 26)
				);
		
		double avg = list.stream()
						.mapToInt(a-> a.getAge()) 	// 중간처리
					//	.mapToInt(Q02_Member::getAge)
						.average()		
						.getAsDouble();
		System.out.println("평균 나이: " + avg);
	}
}
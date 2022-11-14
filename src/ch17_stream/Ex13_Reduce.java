package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex13_Reduce {

	public static void main(String[] args) {
		List<Ex13_Student> list = new ArrayList<>();
		list.add(new Ex13_Student("홍길동", 80));
		list.add(new Ex13_Student("유미선", 94));
		list.add(new Ex13_Student("신용권", 90));
		
		// 방법1
		int sum1 = list.stream()
						.filter(st -> st.getScore() % 2 == 1)
						.mapToInt(Ex13_Student::getScore)//st -> st.getScore()
						.sum();
		System.out.println("방법1: " + sum1);
		
		// 방법2
		int sum2 = list.stream()
						.filter(st -> st.getScore() % 2 == 1)
						.mapToInt(Ex13_Student::getScore)
						.reduce(0, (a, b) -> a+b);
		System.out.println("방법2: " + sum2);

	}

}

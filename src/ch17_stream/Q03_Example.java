package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q03_Example {

	public static void main(String[] args) {
		List<Q03_Member> list = Arrays.asList(
				new Q03_Member("홍길동", "개발자"),
				new Q03_Member("김나리", "디자이너"),
				new Q03_Member("신용권", "개발자")
				);
			
		List<Q03_Member> developers = list.stream()
										.filter(a-> a.getJob().equals("개발자"))
										.collect(Collectors.toList());
		developers
	//				.stream()
				  .forEach(m -> System.out.println(m.getName()));
	}
}
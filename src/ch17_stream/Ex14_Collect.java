package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex14_Collect {

	public static void main(String[] args) {
		List<Ex14_Student> totalList = new ArrayList<>();
		totalList.add(new Ex14_Student("홍길동", "남", 92));
		totalList.add(new Ex14_Student("김수영", "여", 87));
		totalList.add(new Ex14_Student("김자바", "남", 93));
		totalList.add(new Ex14_Student("오해영", "여", 95));
		
		// 남학생만 묶는 경우
		List<Ex14_Student> maleList = totalList.stream()
												.filter(a -> a.getGender().equals("남"))
												.collect(Collectors.toList());
		maleList.forEach(s -> System.out.println(s.getName()));
		
//		maleList = totalList.stream()
//				.filter(a -> a.getGender().equals("남"))
//				.toList();
//		maleList.forEach(s -> System.out.println(s.getName()));
		
		// 학생 -> Map <이름, 성적>
		Map<String, Integer> map = totalList.stream()
											.collect(
													Collectors.toMap(s->s.getName(),
																	s->s.getScore())
													);
		map.forEach((k, v) -> System.out.println(k + ": " + v));
	}
}
package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Q01_Example {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book", 
				"lambda Expressions", 
				"Java8 supports lambda expressions");
		
		list.stream()
	//		.filter(s -> s.toLowerCase().contains("java"))
			.filter(a -> a.toLowerCase().indexOf("java")>=0)
			.forEach(s -> System.out.println(s));
	}
}

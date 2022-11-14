package ch15_collection.question;

import java.util.HashSet;
import java.util.Set;

public class Q02HashSetExample {

	public static void main(String[] args) {
		Set<Q03Student> set = new HashSet<Q03Student>();
		
		set.add(new Q03Student(1, "홍길동"));
		set.add(new Q03Student(2, "신용권"));
		set.add(new Q03Student(1, "조민우"));
		
		System.out.println("저장된 객체 수: " + set.size());
		for (Q03Student s: set)
			System.out.println(s.studentNum + ":" +s.name);
	}

}

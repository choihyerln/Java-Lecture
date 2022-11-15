package exercise;

import java.util.HashSet;

public class Q01_StudentExample {

	public static void main(String[] args) {
		HashSet<Q01_Student> hashSet = new HashSet<Q01_Student>();
		
		hashSet.add(new Q01_Student("1"));
		hashSet.add(new Q01_Student("1"));
		hashSet.add(new Q01_Student("3"));
		
		System.out.println("저장된 Student 수: " + hashSet.size());
	}

}

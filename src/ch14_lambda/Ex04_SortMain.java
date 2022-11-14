package ch14_lambda;

import java.util.Arrays;

import ch11.sec11_arrays.Ex05_Member;

public class Ex04_SortMain {

	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "박자바");
		Ex04_Member member2 = new Ex04_Member(1, "이자바");
		Ex04_Member member3 = new Ex04_Member(2, "김자바");
		Ex04_Member[] members = {member1, member2, member3};
		
		// Comparator 자리에 람다식을 사용할 수 있음
		Arrays.sort(members, (o1, o2) -> o1.name.compareTo(o2.name)); // 오름차순
		for (Ex04_Member member : members)
			System.out.println(member);
		System.out.println();
		
		// name 내림차순 정렬
		Arrays.sort(members, (o1, o2) -> o2.name.compareTo(o1.name));
		for (Ex04_Member member : members)
		System.out.println(member);
		System.out.println();
		
		// id 내림차순 정렬
		Arrays.sort(members, (o1, o2) -> o2.id - (o1.id));
		for (Ex04_Member member : members)
		System.out.println(member);
	}
}
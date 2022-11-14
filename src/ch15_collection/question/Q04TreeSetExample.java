package ch15_collection.question;

import java.util.TreeSet;

public class Q04TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Q04Student2> treeSet = new TreeSet<Q04Student2>();
		treeSet.add(new Q04Student2("blue", 96));
		treeSet.add(new Q04Student2("hong", 86));
		treeSet.add(new Q04Student2("white", 92));
		
		Q04Student2 student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
	}
}

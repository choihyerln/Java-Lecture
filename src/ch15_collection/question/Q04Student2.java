package ch15_collection.question;

public class Q04Student2 implements Comparable<Q04Student2>{
	public String id;
	public int score;
	public Q04Student2 (String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Q04Student2 o) {
		return score - o.score;
	}
}

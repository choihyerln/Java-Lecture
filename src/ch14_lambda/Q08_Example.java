package ch14_lambda;

public class Q08_Example {
	private static Q08_Student[] students = {
		new Q08_Student("홍길동", 90, 96),
		new Q08_Student("신용권", 95, 93)
	};
	public static double avg(Q08_Function<Q08_Student> f) {
		double sum = 0;
		for(Q08_Student student: students)
			sum += f.apply(student);
		return sum / students.length;
	}
	
	public static void main(String[] args) {
		double engAvg = avg (s -> s.getEngScore());
		System.out.println("영어 평균 점수: " + engAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
package exercise;

public class Q03_FullTime {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int[] scores = new int[1000];
		for (int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		double avg = (double)sum / scores.length;
		System.out.println(avg);
		long endTime = System.nanoTime();
		System.out.println("경과시간: " + (endTime-startTime) + "나노초");
	}
}

package exercise;

public class Q07_PerfectNumber {

	public static void main(String[] args) {

		for (int i=2; i<10000; i++) {
			int sumOfDivisors = 0;
			for (int k=1; k<i; k++) {
				if(i % k == 0)		// k는 i의 약수
					sumOfDivisors += k;
			}
			if	(i == sumOfDivisors)
				System.out.println(i);
		}
	}
}

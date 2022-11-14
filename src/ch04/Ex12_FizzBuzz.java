package ch04;
/**
 * for 문을 이용한 FizzBuzz
 */
public class Ex12_FizzBuzz {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i % 15 == 0)
				System.out.print("FizzBuzz ");
			else if (i % 5 == 0)
				System.out.print("Buzz ");
			else if (i % 3 == 0)
				System.out.print("Fizz ");
			else
				System.out.print(i + " ");
	}

}
}


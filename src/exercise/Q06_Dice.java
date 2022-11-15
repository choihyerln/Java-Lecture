package exercise;

import java.util.Random;

public class Q06_Dice {

	public static void main(String[] args) {
		Random random = new Random();
		int num1 = random.nextInt(6) +1;
		int num2 = random.nextInt(6) +1;
		int num3 = random.nextInt(6) +1;
		int prize = getPrize(num1, num2, num3);
		System.out.println("주사위 눈: " + num1 + ", " + num2 +", "+num3);
		System.out.printf("상금: %,d%n", prize);
		}

	private static int getPrize(int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3) {
			return 10000 + (num1*1000);
		}
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			if (num2 == num3) {
				return 1000 + num2*100;
			}
			return 1000 + num1*100;
			}
		int max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		return max * 100;
	}
}
package ch05;
/**
 * 향상된 For (Enhanced-for)
 */
public class Ex16_EnhancedFor {

	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Cherry"};
		for (int i=0; i<fruits.length; i++)
			System.out.println(fruits[i]);		// 지정할 때 사용
		
		for (String fruit : fruits) {
			System.out.println(fruit);			// 전체 출력할 땐 아주 간단한 방법
		}
		
		int[] score = {82, 90, 76, 78, 84};
		int sum = 0;
		for (int element : score)
			sum += element;
		System.out.println((double)sum / score.length);

					
		}
	}


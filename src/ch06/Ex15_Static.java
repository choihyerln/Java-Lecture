package ch06;

public class Ex15_Static {
	
	static double pi = 3.14159;	
	int x;			// instance field
	static final double PI = 3.14159; // final을 붙여주면 변하지 않는 값이 됨, 나중에 PI 값을 변경하려는 시도가 나타나면 에러남
	
	static int power(int base, int exponent) {
		int res = 1;
		for (int i=1; i<=exponent; i++) {
			res *=base;
		}
		return res;
	}
	
	static double circleArea(double radius) {
		return pi * radius * radius;
	}
	
	int power2() {		// instance method
		int res =1;
		System.out.println(pi);
		for (int i=1; i<=x; i++)
			res *= 2;
		return res;
	}
	

}

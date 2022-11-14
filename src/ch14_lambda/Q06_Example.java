package ch14_lambda;

public class Q06_Example {
	public static double calc(Q06_Function fun) {
		double x =10;
		double y =4;
		return fun.apply(x, y);
	}
	public static void main(String[] args) {
		double result = calc( (x,y)->(x/y));
		System.out.println("result: " + result);	
	}

}

package ch14_lambda;

import java.util.function.IntPredicate;

public class Ex08_AndOrNegate {

	public static void main(String[] args) {
		// 2의 배수 검사
		IntPredicate pa = a -> a % 2 == 0;
		
		// 3의 배수 검사
		IntPredicate pb = a -> a % 3 == 0;
		
		// and()
		IntPredicate pab = pa.and(pb);		// 2의 배수이면서 3의 배수 => 2와 3의 공배수
		System.out.println(pab.test(6));
		System.out.println(pab.test(9));
		
		// or()
		pab = pa.or(pb);		// 2의 배수이거나 3의 배수
		System.out.println(pab.test(5));
		System.out.println(pab.test(12));
		
		// negate() : not
		pab = pa.negate();
		System.out.println(pab.test(6));
		System.out.println(pab.test(9));
	}
}
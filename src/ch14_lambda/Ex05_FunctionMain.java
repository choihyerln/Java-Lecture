package ch14_lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex05_FunctionMain {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Runneble");	// no args, no return
		Consumer<Integer> c = i -> System.out.println(i*i);	// With args, no return 입력은 있고 아웃풋은 없음
		Supplier<Integer> s = () -> (int)(Math.random() * 6) + 1;	// No args, with return 입력은 없고 아웃풋은 있음
		Function<Integer, Integer> f = i -> i * i;	// With args, with return 입력도 있고 아웃풋도 있음
		Predicate<Integer> p = x -> x % 2 == 1;		// With args, with return boolean 입력도 있고 아웃풋도 있음
		
		r.run();
		c.accept(5);
		System.out.println(s.get());
		System.out.println(f.apply(5));
		System.out.println(p.test(3));
		
		BiConsumer<Integer, Integer> bc = (x, y) -> System.out.println(x + y);
		BiFunction<Integer, Integer, Double> bf = (x, y) -> Math.sqrt(x*x +y*y);
		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		
		bc.accept(3, 4);
		System.out.println(bf.apply(3, 4));
		System.out.println(bp.test(3, 4));
	}
}
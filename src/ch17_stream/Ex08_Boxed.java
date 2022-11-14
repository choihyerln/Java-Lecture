package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
/**
 * Boxed - Wrapper
 */
public class Ex08_Boxed {

	public static void main(String[] args) {
		int[] intArray = {1, 3, 4, 7, 6};
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream()
				.forEach(d -> System.out.println(d));
		System.out.println();
		
		intStream = Arrays.stream(intArray);	// stream은 1회용, 다시 선언해줘야함
		intStream.boxed()
				.forEach(obj -> System.out.println(obj.intValue()));
	}
}
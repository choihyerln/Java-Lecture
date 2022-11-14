package ch11.sec12_wrapper;

public class Ex01_BoxingUnboxing {

	public static void main(String[] args) {
		
		// boxing
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = 300;		// 자동 박싱
		
		// unboxing
		int value1 = obj1.intValue();
		int value2 = obj2;		// 자동 언박싱
		int value3 = obj3;
		
		System.out.println(value1 + ", " + value2 + ", " + value3);
		System.out.println(obj1);

	}

}

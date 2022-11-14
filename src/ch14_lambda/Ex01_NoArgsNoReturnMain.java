package ch14_lambda;
/**
 * No arguments, no return value
 */
public class Ex01_NoArgsNoReturnMain {

	public static void main(String[] args) {
		Ex01_FunctionalInterface fi;
		
		fi = () -> {};
			String str = "method call";
			System.out.println(str);
		fi.method();
			
		fi = () -> {System.out.println("method call"); };
		fi.method();
		
		fi = () -> System.out.println("method call");
		fi.method();
		
		Runnable run = () -> System.out.println("method call");
		fi.method();
	}
}
//
//class FunctionalInterface implements Ex01_FunctionalInterface {
//	@Override
//	public void method() {
//		String str = "method call";
//		System.out.println(str);
//	}
//}

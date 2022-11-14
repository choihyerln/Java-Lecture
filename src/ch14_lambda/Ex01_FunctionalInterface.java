package ch14_lambda;

@FunctionalInterface
public interface Ex01_FunctionalInterface {
	public abstract void method();		// public abstract 생략가능
//	void otherMethod();		// 추상 메소드가 2개 이상이면 안됨
}

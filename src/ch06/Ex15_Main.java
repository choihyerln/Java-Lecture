package ch06;

public class Ex15_Main {

	public static void main(String[] args) {
		System.out.println(Ex15_Static.pi);
		
		int twoOfTen = Ex15_Static.power(2, 10);
		System.out.println(twoOfTen);
		
		// Math, Integer, Arrays, ...
		
		// static member는 객체를 생성해서 사용하는 것이 바람직하지 않은 방법
		Ex15_Static st = new Ex15_Static();
		System.out.println(st.pi);
		
		st.x = 10;
		System.out.println(st.power2());
	}

}

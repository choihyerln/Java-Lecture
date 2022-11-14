package ch10;

public class Ex01_NullPointer {

	public static void main(String[] args) {
		String str = null;	// data가 null일 경우
		if (str != null)
			System.out.println(str.length());		
	}

}

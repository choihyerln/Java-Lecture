package ch11.sec07_string;
/**
 * 숫자값을 보려하지 말고, 부호만 볼 것 (음수인지 양수인지..뭔가 먼저인지!)
 */
public class Ex10_CompareTo {

	public static void main(String[] args) {
		String str1 = "Apple";
		String str2 = "Cherry";
		String str3 = "air";
		System.out.println(str1.compareTo(str2));	// A, C 의 차이는 2칸 => -2
		System.out.println(str1.compareToIgnoreCase(str3)); // 대소문자 구분하지 말고
		
		String han1 = "ㄱㄴㄷ";
		String han2 = "ㄹㅁ";
		System.out.println(han1.compareTo(han2));
		System.out.println(str1.compareTo(han1)); // 결과는 음수 : 영어가 먼저니까..
		
	}

}

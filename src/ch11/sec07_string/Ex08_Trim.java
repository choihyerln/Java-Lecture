package ch11.sec07_string;

public class Ex08_Trim {

	public static void main(String[] args) {
		String oldStr = "	자바 프로그래밍  \t \r\n ";	// 글자 사이에 있는 스페이스는 없애주지 않음
		String newStr = oldStr.trim();
		
		System.out.println(newStr);
		System.out.println(newStr.length());
	}

}

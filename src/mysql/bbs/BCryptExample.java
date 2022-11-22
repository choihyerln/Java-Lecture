package mysql.bbs;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptExample {

	public static void main(String[] args) {
		String pwd = "1234asdf";
		String cryptedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd.length());
		System.out.println(cryptedPwd);
		
		String cryptedPwd2 = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd2);
		System.out.println();
		
		String salt = BCrypt.gensalt();
		System.out.println(salt);
		System.out.println(salt.length());
		
		//salt값이 동일하면 만들어진 비문이 동일함
		System.out.println(BCrypt.hashpw(pwd, salt));
		System.out.println(BCrypt.hashpw(pwd, salt));
		
		// 패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd, cryptedPwd);
		System.out.println(result);
	}
}
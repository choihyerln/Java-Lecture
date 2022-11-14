package ch11.sec07_string;

import java.util.Scanner;

public class Q05_CaesarCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String plainText = scan.nextLine
	}
	
	/* 암호화 */
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];
		for (int i=0; i<text.length(); i++){
			char c = text.charAt(i);
			if (c==' ') {
				cipherText[i] = c;
				continue;
			}
			char d = (char)(c+step);
			if(d>'z')
				d =(char)(d-26);
			cipherText[i] = d;
		}
		return new String(cipherText);
	}
	/* 복호화 */
	static String cipher2plain(String text, int step) {
		return null;
	}
}

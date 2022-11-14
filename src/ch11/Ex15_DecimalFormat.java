package ch11;

import java.text.DecimalFormat;

public class Ex15_DecimalFormat {

	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		df = new DecimalFormat("########.####");
		System.out.println(df.format(num));
		df = new DecimalFormat("00000000.0000");
		System.out.println(df.format(num));
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		df = new DecimalFormat("#,###.0");			// 천단위 구분 기호(,)
		System.out.println(df.format(num));
		df = new DecimalFormat("0,000.0");
		System.out.println(df.format(num));
	}

}

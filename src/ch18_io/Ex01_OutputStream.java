package ch18_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_OutputStream {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/Users/choihyerin/Desktop/IO/test.txt");
			
			byte a =10, b = 20;
			int c = 30;
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	}
}
package ch18_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07_BufferedIO {

	public static void main(String[] args) throws IOException {
		
		// case1 입출력 스트림으로 복사
		FileInputStream fis = new FileInputStream("/Users/choihyerin/Downloads/IMG_0328 2.jpg");
		FileOutputStream fos = new FileOutputStream("/Users/choihyerin/Downloads/IMG_0328 2 복사본.jpg");
		
		// case2 입출력 스트림 + 버퍼 스트림으로 복사
		FileInputStream fis2 = new FileInputStream("/Users/choihyerin/Downloads/IMG_0328 2.jpg");
		FileOutputStream fos2 = new FileOutputStream("/Users/choihyerin/Downloads/IMG_0328 2 복사본.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 버퍼를 사용하지 않고 복사하는 경우
		long noBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용: " + noBufferTime + "ns");
		
		// 버퍼를 사용하여 복사하는 경우
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용: " + bufferTime + "ns");
		
		System.out.println(noBufferTime / bufferTime);
		
		fis.close();
		fos.close();
		fis2.close();
		fos2.close();
		bis.close();
		bos.close();
	}
	public static long copy(InputStream is, OutputStream os) throws IOException{
		long startTime = System.nanoTime();
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return 0L;
	}
}

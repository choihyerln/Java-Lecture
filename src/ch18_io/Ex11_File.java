package ch18_io;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex11_File {

	public static void main(String[] args) throws Exception {
		File dir = new File("/Users/choihyerin/Desktop/IO/images");
		File file1 = new File("/Users/choihyerin/Desktop/IO/file1.txt");
		File file2 = new File("/Users/choihyerin/Desktop/IO/file2.txt");
		File file3 = new File("/Users/choihyerin/Desktop/IO/file3.txt");
		
		// 존재하지 않으면 디렉토리 또는 파일을 생성
		if (!dir.exists()) dir.mkdir();
		if (!file1.exists()) file1.createNewFile();
		if (!file2.exists()) file2.createNewFile();
		if (!file3.exists()) file3.createNewFile();
		
		// IO 디렉토리 내용 출력
		File io = new File("/Users/choihyerin/Desktop/IO");
		File[] contents = io.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");
		for (File file: contents) {
			System.out.printf("%-25s", sdf.format(file.lastModified()));
			System.out.println(file.getName());
		}
	}
}

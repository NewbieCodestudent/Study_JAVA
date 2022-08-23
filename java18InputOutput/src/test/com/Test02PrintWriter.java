package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test02PrintWriter {

	public static void main(String[] args) {
		System.out.println("Hello Output");
		
		String path = "golfzon.txt";  // 파일 이름을 path로 작성
		File file = new File(path);   // path 제목으로 file 생성
		FileOutputStream fos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream(file);  // 파일을 생성해 준다.
			ps = new PrintStream(fos);         // 파일에 글을 작성한다.
			
			for (int i = 0; i < 5; i++) {
				ps.println("Hello Java..." + i);
			}
			
			ps.flush(); // PrintStream 닫기
			System.out.println("ps successed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ps!=null) {
				ps.close();
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}//end main

}//end class
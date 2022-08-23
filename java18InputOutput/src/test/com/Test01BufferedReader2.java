package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test01BufferedReader2 {

	public static void main(String[] args) {
		System.out.println("Hello IO");
		// IO는 java.io에 있는 패키지를 사용한다.

		String path = "C:\\golfzon\\javaStudy\\java18InputOutput\\txt\\language2.txt";  // 파일주소를 직접 path에 입력 
		File file = new File(path);
		System.out.println(file.exists());  // 파일이 경로에 있으면 true 없으면 false를 출력
		System.out.println(file.isFile());  // 파일형식이 맞는지 확인
		System.out.println(file.isDirectory());  // 디렉토리가 맞는지 확인
		
		if(file.exists()) {
			Reader fr = null;          // Reader 또는 FileReader로 타입 선정가능
			BufferedReader br = null;  // BudderedReader 보조 스트림 연결
			try {
				fr = new FileReader(file);        
				br = new BufferedReader(fr);
				String data = "";
				StringBuilder sb = new StringBuilder();
				while((data = br.readLine()) != null) {
//					String data = br.readLine();    // 라인단위 문자열을 읽고 data에 입력
//					if(data == null) break;
//					System.out.println(data);
					sb.append(data+"\n");
				}
				System.out.println(sb.toString());
			} catch (FileNotFoundException e) { 
				e.printStackTrace();
			} catch (IOException e) {            // br.readline()의 catch문
				e.printStackTrace();
			}finally {
				if(fr!=null) {
					try {
						fr.close();  // FileReader 스트림 닫기
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(br!=null) {
					try {
						br.close(); // BufferedReader 스트림 닫기
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}// end main

}// end class
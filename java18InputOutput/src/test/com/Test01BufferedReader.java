package test.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

public class Test01BufferedReader {

	public static void main(String[] args) {
		System.out.println("Hello IO");
		// IO는 java.io에 있는 패키지를 사용한다.

//		Reader r = new InputStreamReader(System.in);
		Class<?> tm_clazz  = Test01BufferedReader.class;
		System.out.println(tm_clazz.getResource("language.txt"));  // language.txt의 경로
		URL url = tm_clazz.getResource("language.txt");            // url에 파일 경로 입력
		String path = url.getPath();                               // url을 path로 수정
		Reader fr = null;                                          // Reader 또는 FileReader로 타입 선정가능
		BufferedReader br = null;                                  // BudderedReader 보조 스트림 연결
		try {
			fr = new FileReader(url.getPath());        
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();    // 라인단위 문자열을 읽고 data에 입력
				if(data == null) break;
				System.out.println(data);
			}
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

	}// end main

}// end class
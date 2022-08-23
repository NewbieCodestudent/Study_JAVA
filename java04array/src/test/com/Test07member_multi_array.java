package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test07member_multi_array {

	public static void main(String[] args) throws IOException {
		// 2차원배열을 이용한 회원가입프로그램
		System.out.println("hello_member_multi_array");
		
		String[] member = new String[5];
		String[][] result = new String[1][];
		result[0] = member;
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String x = "y";
		int num = 1;
		
		for (int i = 0; i < member.length; i++) {
			System.out.println("회원번호 "+num+"번 입니다.");
			System.out.println("id를 입력해 주세요.");
//			String id = br.readLine();
			String id = "admin";
			
			System.out.println("pw를 입력해 주세요.");
//			String pw = br.readLine();
			String pw = "hi1234";

			System.out.println("name를 입력해 주세요.");
//			String name = br.readLine();
			String name = "kim";

			System.out.println("tel를 입력해 주세요.");
//			String tel = br.readLine();
			String tel = "010";

			member[i] = num + "번 " + id + " " + pw + " " + name + " " + tel;
//			result[i] = new String[] {String.valueOf(i+1), id, pw, name, tel};
//			result[i] = member.split(""); // 문자열의 구분자(특정한 글, 기호)를 기준으로 자동으로 나누어서 각 방에 저장하는 함수
			num++;
		}
		for (String[] y : result) {
			for (String i : y) {
				System.out.println(i);
			}
		}
		
//		for (int xx = 0; xx < result.length; xx++) {
//			for (int i = 0; i < member.length; i++) {
//				System.out.println(result[xx][i]);
//			}
//		}
		

	}//end main

}//end class
